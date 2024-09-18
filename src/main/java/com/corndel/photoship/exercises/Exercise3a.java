package com.corndel.photoship.exercises;

public class Exercise3a {
  // https://tech-docs.corndel.com/java/string-formatting.html

  /**
   * Outputs a string saying "Hello, my name is NAME!" with the name in uppercase.
   *
   * <p>
   * e.g. ("Abdi") => "Hello, my name is ABDI!"
   *
   * @param {String} name - The name
   * @returns {String} The greeting string with uppercase name interpolated
   */
  public static String nameTag(String name) {
    return "Hello, my name is " + name.toUpperCase() + "!";
  }
}
