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

import java.util.ArrayList;
import java.util.List;

import org.ducktools.bdd.samples.lib.NumberNormalizer;

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
public class Calculator {

  private NumberNormalizer normalizer;

  public Calculator() {

  }

  public Calculator(NumberNormalizer normalizer) {
    this.normalizer = normalizer;
  }

  public List<Integer> primeFactors(int number) {
    int n = number;
    List<Integer> factors = new ArrayList<Integer>();

    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }

    return factors;
  }

  public List<Integer> primeFactors(double number) {
    return primeFactors(normalizer.asInteger(number));
  }
}
