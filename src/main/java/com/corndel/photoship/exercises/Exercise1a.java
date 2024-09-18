package com.corndel.photoship.exercises;

public class Exercise1a {
  // Read https://tech-docs.corndel.com/java/arrays.html first!

  /**
   * Returns the sum of the first and last elements of the array.
   *
   * <p>
   * e.g. [4, 1, 9, 5, 2] => 6
   *
   * @param {int[]} nums - An array of numbers.
   * @returns {int} The sum of the first and last elements.
   */
  public static int firstAddLast(int[] nums) {

    int arrayLength = nums.length;
    return nums[0] + nums[arrayLength-1];
  }
}