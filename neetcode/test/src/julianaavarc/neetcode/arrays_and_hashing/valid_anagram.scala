package julianaavarc.neetcode
package arrays_and_hashing.valid_anagram

import org.scalatest.*
import funsuite.*

trait Example:
  val s: String
  val t: String
  val output: Boolean

object Example1 extends Example:
  val s      = "racecar"
  val t      = "carrace"
  val output = true

object Example2 extends Example:
  val s      = "jar"
  val t      = "jam"
  val output = false

class Solution1Spec extends AnyFunSuite:
  test("Valid Anagram - Example 1"):
    import Example1.*
    assertResult(output) { Solution1.validAnagram(s, t) }
  test("Valid Anagram - Example 2"):
    import Example2.*
    assertResult(output) { Solution1.validAnagram(s, t) }

class Solution2Spec extends AnyFunSuite:
  test("Valid Anagram - Example 1"):
    import Example1.*
    assertResult(output) { Solution2.validAnagram(s, t) }
  test("Valid Anagram - Example 2"):
    import Example2.*
    assertResult(output) { Solution2.validAnagram(s, t) }

class Solution3Spec extends AnyFunSuite:
  test("Valid Anagram - Example 1"):
    import Example1.*
    assertResult(output) { Solution3.validAnagram(s, t) }
  test("Valid Anagram - Example 2"):
    import Example2.*
    assertResult(output) { Solution3.validAnagram(s, t) }

class Solution4Spec extends AnyFunSuite:
  test("Valid Anagram - Example 1"):
    import Example1.*
    assertResult(output) { Solution4.validAnagram(s, t) }
  test("Valid Anagram - Example 2"):
    import Example2.*
    assertResult(output) { Solution4.validAnagram(s, t) }
