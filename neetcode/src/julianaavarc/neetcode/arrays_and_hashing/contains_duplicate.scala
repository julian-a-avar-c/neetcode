package julianaavarc.neetcode

/** Duplicate Integer
  *
  * Given an integer array nums, return true if any value appears more than once
  * in the array, otherwise return false.
  */
package arrays_and_hashing.contains_duplicate

import scala.collection.mutable
import scala.util.boundary

object Solution1 extends Solution:
  def containsDuplicate(nums: Seq[Int]): Boolean =
    val cache = mutable.Set.empty[Int]

    boundary {
      for n <- nums do
        if cache.contains(n) then boundary.break(true)
        cache += n
      false
    }
  end containsDuplicate
end Solution1
