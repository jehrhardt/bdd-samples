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
package org.ducktools.bdd.samples

import org.ducktools.bdd.samples.lib.NumberNormalizer

import spock.lang.Specification

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
class CalculatorSpec extends Specification {

    def "it should calculate the prime factors of integers"() {
        given: "a calculator"
        def calculator = new Calculator()

        when: "the primefactors of ${number} are calculated"
        def result = calculator.primeFactors(number)

        then: "the result is ${primeFactors}"
        primeFactors == result

        where:
        number << [1, 2, 6, 7]
        primeFactors << [[], [2], [2, 3], [7]]
    }

    def "it should calculate the prime factors of doubles"() {
        given: "a calculator and NumberNormalizer"
        NumberNormalizer normalizer = Mock()
        normalizer.asInteger(_) >> {(Integer) number}
        def calculator = new Calculator(normalizer)

        when: "the primefactors of ${number} are calculated"
        def result = calculator.primeFactors(number)

        then: "the result is ${primeFactors}"
        primeFactors == result

        where:
        number << [1.0, 2.0, 6.0, 7.0]
        primeFactors << [[], [2], [2, 3], [7]]
    }
}
