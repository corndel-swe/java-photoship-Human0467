package com.corndel.photoship.exercises;

import java.util.List;

public class Exercise2a {
  // https://tech-docs.corndel.com/java/list-techniques.html

  /**
   * Returns the middle elements of the array, without the first and last
   * elements.
   *
   * <p>
   * e.g. [4, 6, 1, 7, 9] => [6, 1, 7]
   *
   * @param {List} list - The list to process
   * @returns {List} The list containing only the middle elements
   */
  public static <T> List<T> getMiddle(List<T> list) {
    list.removeFirst();
    list.removeLast();
    return list;
  }
}
