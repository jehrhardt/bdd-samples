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

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.JavaConversions._

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
@RunWith(classOf[JUnitRunner])
class CalculatorSpec extends FlatSpec with ShouldMatchers {

  it should "calculate the prime factors of 6" in {
    val calculator = new Calculator()
    (calculator primeFactors 6).toArray should equal (List(2, 3).toArray)
  }
}
