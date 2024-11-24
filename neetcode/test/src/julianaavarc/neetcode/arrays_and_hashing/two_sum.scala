package julianaavarc.neetcode
package arrays_and_hashing.two_sum

import org.scalatest.*
import funsuite.*

trait Example:
  val nums: Seq[Int]
  val target: Int
  val output: Seq[Int]

object Example1 extends Example:
  val nums   = Seq(3, 4, 5, 6)
  val target = 7
  val output = Seq(0, 1)

object Example2 extends Example:
  val nums   = Seq(4, 5, 6)
  val target = 10
  val output = Seq(0, 2)

object Example3 extends Example:
  val nums   = Seq(5, 5)
  val target = 10
  val output = Seq(0, 1)

class Solution1Spec extends AnyFunSuite:
  // Solution 1
  test("Two Sum - Example 1"):
    import Example1.*
    assertResult(output) { Solution1.twoSum(nums, target) }
  test("Two Sum - Example 2"):
    import Example2.*
    assertResult(output) { Solution1.twoSum(nums, target) }
  test("Two Sum - Example 3"):
    import Example3.*
    assertResult(output) { Solution1.twoSum(nums, target) }
