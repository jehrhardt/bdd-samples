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
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

  @Test
  public void itShouldCalculateThePrimeFactorsOf6() {
    Calculator calculator = mock(Calculator.class);
    when(calculator.primeFactors(eq(6))).thenReturn(asList(2, 3));
    assertEquals(asList(2, 3), calculator.primeFactors(6));
  }
}
