package com.corndel.photoship.exercises;

public class Exercise3b {
  // https://tech-docs.corndel.com/java/string-formatting.html

  /**
   * Formats the amount as a price, with the given currency symbol at the front
   *
   * <p>
   * e.g. (2.5, "$") => "$2.50" e.g. (12.83795, "£") => "£12.84"
   *
   * @param {double} amount - The amount of money
   * @param {String} currency - The currency symbol
   * @returns {String} currency The formatted number
   */
  public static String formatPrice(double amount, String currency) {

    return currency + String.format("%.2f", amount);
  }
}
