/**
 * This is an example on using different frameworks for BDD on Java.
 * Copyright (C) 2011 Jan Ehrhardt
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ducktools.bdd.samples;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.eq;

import java.util.List;

import org.ducktools.bdd.samples.lib.NumberNormalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

  @Mock
  NumberNormalizer normalizer;

  @Test
  public void it_should_calculate_the_prime_factors_of_6() {
    // given: a calculator
    Calculator calculator = new Calculator();

    // when: prime factors of 6 are calculated
    List<Integer> result = calculator.primeFactors(6);

    // then: [2, 3] is the result
    assertEquals(asList(2, 3), result);
  }

  @Test
  public void it_should_calculate_the_prime_factors_of_6_as_double() {
    // given: a calculator with a NumberNormalizer
    given(normalizer.asInteger(eq(6.0))).willReturn(6);
    Calculator calculator = new Calculator(normalizer);

    // when: prime factors of 6.0 are calculated
    List<Integer> result = calculator.primeFactors(6.0);

    // then: [2, 3] is the result
    assertEquals(asList(2, 3), result);
  }
}
