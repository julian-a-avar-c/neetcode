package julianaavarc.neetcode
package arrays_and_hashing.group_anagrams

import org.scalatest.*
import funsuite.*
import org.scalatest.matchers.should.Matchers

trait Example:
  val strs: Seq[String]
  val output: Set[Set[String]]

object Example1 extends Example:
  val strs   = Seq("act", "pots", "tops", "cat", "stop", "hat")
  val output = Set(Set("hat"), Set("act", "cat"), Set("stop", "pots", "tops"))

object Example2 extends Example:
  val strs   = Seq("x")
  val output = Set(Set("x"))

object Example3 extends Example:
  val strs   = Seq("")
  val output = Set(Set(""))

class Solution1Spec extends AnyFunSuite with Matchers:
  test("Group Anagrams - Example 1"):
    import Example1.*
    assertResult(output) { Solution1.groupAnagrams(strs) }
  test("Group Anagrams - Example 2"):
    import Example2.*
    assertResult(output) { Solution1.groupAnagrams(strs) }
  test("Group Anagrams - Example 3"):
    import Example3.*
    assertResult(output) { Solution1.groupAnagrams(strs) }

class Solution2Spec extends AnyFunSuite with Matchers:
  test("Group Anagrams - Example 1"):
    import Example1.*
    assertResult(output) { Solution2.groupAnagrams(strs) }
  test("Group Anagrams - Example 2"):
    import Example2.*
    assertResult(output) { Solution2.groupAnagrams(strs) }
  test("Group Anagrams - Example 3"):
    import Example3.*
    assertResult(output) { Solution2.groupAnagrams(strs) }

class Solution3Spec extends AnyFunSuite with Matchers:
  test("Group Anagrams - Example 1"):
    import Example1.*
    assertResult(output) { Solution3.groupAnagrams(strs) }
  test("Group Anagrams - Example 2"):
    import Example2.*
    assertResult(output) { Solution3.groupAnagrams(strs) }
  test("Group Anagrams - Example 3"):
    import Example3.*
    assertResult(output) { Solution3.groupAnagrams(strs) }
