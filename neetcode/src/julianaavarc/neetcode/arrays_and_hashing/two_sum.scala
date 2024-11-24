package julianaavarc.neetcode

/** Two Integer Sum
  *
  * Given an array of integers nums and an integer target, return the indices i
  * and j such that nums[i] + nums[j] == target and i != j.
  *
  * You may assume that every input has exactly one pair of indices i and j that
  * satisfy the condition.
  *
  * Return the answer with the smaller index first.
  *
  * Constraints:
  * ```
  * 2 <= nums.length <= 1000
  * -10,000,000 <= nums[i] <= 10,000,000
  * -10,000,000 <= target <= 10,000,000
  * ```
  */
package arrays_and_hashing.two_sum

import scala.collection.mutable
import scala.util.boundary
import scala.collection.mutable.Buffer

object Solution1 extends Solution:
  def twoSum(nums: Seq[Int], target: Int): collection.Seq[Int] =
    val indexOfN = mutable.Map.empty[Int, Int]

    for
      i <- 0 until nums.length
      n = nums(i)
    do indexOfN(n) = i

    boundary {
      for
        i <- 0 until nums.length
        n          = nums(i)
        compliment = indexOfN.get(target - n)
      do
        if compliment.isDefined then
          boundary.break(Seq(i, compliment.get).sorted)

      Seq.empty[Int]
    }
  end twoSum
end Solution1
