package julianaavarc.neetcode

/** Group Anagrams
  *
  * Given an array of strings strs, group all anagrams together into sublists.
  * You may return the output in any order.
  *
  * An anagram is a string that contains the exact same characters as another
  * string, but the order of the characters can be different.
  *
  * Constraints:
  * ```
  * 1 <= strs.length <= 1000.
  * 0 <= strs[i].length <= 100
  * strs[i] is made up of lowercase English letters.
  * ```
  *
  * Recommended Time & Space Complexity
  *
  * You should aim for a solution with O(m * n) time and O(m) space, where m is
  * the number of strings and n is the length of the longest string.
  */
package arrays_and_hashing.group_anagrams

import scala.collection.mutable
import scala.util.boundary
import scala.collection.mutable.Buffer

object Solution1 extends Solution:
  def groupAnagrams(strs: Seq[String]): Set[Set[String]] =
    type Histogram = Map[Char, Int]
    def histogram(str: String): Histogram =
      str.groupBy(_.toChar).view.mapValues(_.length).toMap
    strs.groupBy(histogram).values.map(_.toSet).toSet
  end groupAnagrams
end Solution1

object Solution2 extends Solution:
  val charToPrime: Map[Char, Int] =
    val chars =
      "abcdefghijklmnopqrstuvwxyz".toList
    val primes = // More primes than letters
      Seq(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
        67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139,
        149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223,
        227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293,
        307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383,
        389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463,
        467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569,
        571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647,
        653, 659, 661, 673, 677, 683, 691, 701, 709, 719)
        .ensuring(_.length == 128)
    chars.zip(primes).toMap
  end charToPrime
  extension (char: Char) def toPrime = charToPrime(char)

  def groupAnagrams(strs: Seq[String]): Set[Set[String]] =
    type Histogram = Int
    def histogram(str: String): Histogram =
      // str.foldLeft(0) { _ + _.toPrime }
      str.view.map(_.toPrime).sum
    strs.groupBy(histogram).values.map(_.toSet).toSet
  end groupAnagrams
end Solution2

object Solution3 extends Solution:
  val charToPrime: Map[Char, Int] =
    val chars =
      "abcdefghijklmnopqrstuvwxyz".toList
    val primes = // More primes than letters
      Seq(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
        67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139,
        149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223,
        227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293,
        307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383,
        389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463,
        467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569,
        571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647,
        653, 659, 661, 673, 677, 683, 691, 701, 709, 719)
        .ensuring(_.length == 128)
    chars.zip(primes).toMap
  end charToPrime
  type Histogram = Int
  extension (string: String)
    def toHistogram: Histogram = string.view.map(charToPrime).sum

  def groupAnagrams(strs: Seq[String]): Set[Set[String]] =
    strs.groupBy(_.toHistogram).values.map(_.toSet).toSet
  end groupAnagrams
end Solution3
