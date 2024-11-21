package julianaavarc.neetcode
package arrays_and_hashing.contains_duplicate

import org.scalatest.*
import funsuite.*

trait Example:
  val nums: Seq[Int]
  val output: Boolean

object Example1 extends Example:
  val nums  = Seq(1, 2, 3, 3)
  val output = true

object Example2 extends Example:
  val nums  = Seq(1, 2, 3, 4)
  val output = false

class Solution1Spec extends AnyFunSuite:
  // Solution 1
  test("Contains Duplicate - Example 1"):
    import Example1.*
    assertResult(output) { Solution1.containsDuplicate(nums) }
  test("Contains Duplicate - Example 2"):
    import Example2.*
    assertResult(output) { Solution1.containsDuplicate(nums) }
