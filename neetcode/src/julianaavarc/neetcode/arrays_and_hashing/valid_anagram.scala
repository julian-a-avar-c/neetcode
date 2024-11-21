package julianaavarc.neetcode

/** Is Anagram
  *
  * Given two strings s and t, return true if the two strings are anagrams of
  * each other, otherwise return false.
  *
  * An anagram is a string that contains the exact same characters as another
  * string, but the order of the characters can be different.
  *
  * Constraints:
  * ```
  * s and t consist of lowercase English letters.
  * ```
  */
package arrays_and_hashing.valid_anagram

import scala.collection.mutable
import scala.util.boundary

object Solution1 extends Solution:
  def validAnagram(s: String, t: String): Boolean =
    val sHistogram = s.groupBy(_.toChar).view.mapValues(_.length).toMap
    val tHistogram = t.groupBy(_.toChar).view.mapValues(_.length).toMap
    sHistogram == tHistogram
  end validAnagram
end Solution1

object Solution2 extends Solution:
  def validAnagram(s: String, t: String): Boolean =
    val countStartingAt1: Option[Int] => Option[Int] = {
      case None        => Some(1)
      case Some(value) => Some(value + 1)
    }

    val sHistogram = mutable.Map.empty[Char, Int]
    val tHistogram = mutable.Map.empty[Char, Int]

    for c <- s do sHistogram.updateWith(c)(countStartingAt1)
    for c <- t do tHistogram.updateWith(c)(countStartingAt1)

    sHistogram == tHistogram
  end validAnagram
end Solution2

object Solution3 extends Solution:
  def validAnagram(s: String, t: String): Boolean =
    boundary {
      val sHistogram = mutable.Map.empty[Char, Int]
      val tHistogram = mutable.Map.empty[Char, Int]

      for c <- s do
        if sHistogram contains c
        then sHistogram(c) += 1
        else sHistogram(c) = 1
      end for

      for c <- t do
        if tHistogram contains c
        then tHistogram(c) += 1
        else tHistogram(c) = 1
      end for

      sHistogram == tHistogram
    }
  end validAnagram
end Solution3

object Solution4 extends Solution:
  def validAnagram(s: String, t: String): Boolean =
    boundary {
      val sHistogram = mutable.Map.empty[Char, Int]
      val tHistogram = mutable.Map.empty[Char, Int]

      for c <- s do
        if sHistogram contains c
        then sHistogram(c) += 1
        else sHistogram(c) = 1
      end for

      for c <- t do
        if tHistogram contains c
        then tHistogram(c) += 1
        else tHistogram(c) = 1
      end for

      sHistogram == tHistogram
    }
  end validAnagram
end Solution4
