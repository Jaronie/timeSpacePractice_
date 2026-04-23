import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


public class Practice {

  // Time Complexity: O(n) n represents elements in original array
  // Space Complexity: O(1) - 1 represents the created arraylist taking in even elements
  // Remember to define your variables!
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Assume a rectangular array where #rows <= #cols
  // Time Complexity: O(n) - looped only through one element through the matrix
  // Space Complexity: O(1) - no variables grow within scale
  // Remember to define your variables!
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n) where n represents T val in array
  // Space Complexity: O(n) frequencies grow with the scale of the T array
  // Remember to define your variables!
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    Map<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n^2) because the loop increments by 2
  // Space Complexity: Also O(n^2) because the evens list stores n*n, this grows quadratically.
  // Remember to define your variables!
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  // Time Complexity: O(n) the loop touches each N once before adding to the result.
  // Space Complexity: O(n) is linear to the elements
  // Remember to define your variables!
  public static List<Integer> concatVals(Map<Integer, List<Integer>> map) {
    List<Integer> result = new ArrayList<>();

    for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
      for(int num : entry.getValue()) {
        result.add(num);
      }
    }
    return result;
  }

  // Time Complexity: o(1) because it runs 7 times only (constant value)
  // Space Complexity: o(1) because it also stores 7 times only
  // Remember to define your variables!
  public static List<Character> septuple(char c) {
    List<Character> result = new ArrayList<>();
    for(int i = 0; i < 7; i++) {
      result.add(c);
    }
    return result;
  }

  // Time Complexity: o(n) or o(rows and columns) it goes by how many rows and columns there are or n or linear
  // Space Complexity: o(n) or o(rows and columns) it measures the memory comparitively.
  // Remember to define your variables!
  public static char[][] initCharRect(int rows, int cols) {
    return new char[rows][cols];
  }

  // Assume all strings in strs are of length s
  // Hint: charAt is an O(1) operation in both time and space
  // Time Complexity: O(n) runs n times where n = str.length
  // Space Complexity: O(n) where n = str.length, adding charAt() per length of string although charAt is O(1) lookup
  // Remember to define your variables!
  public static List<Character> concatStrings(List<String> strs) {
    List<Character> concat = new ArrayList<>();
    for(String str : strs) {
      for(int i = 0; i < str.length(); i++) {
        concat.add(str.charAt(i));
      }
    }
    return concat;
  }

  // Time Complexity: O(1) the arithmetic expressions are always going to return a constant value
  // Space Complexity: O(1) because the variables are primitive/constant
  // Remember to define your variables!
  public static int cubic(int n, int a, int b, int c, int d) {
    int result = d;
    result += c * n;
    result += b * n * n;
    result += a * n * n * n;
    return result;
  }


  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.length
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: o(n), because the array goes once when getting the hashmap.
   * Space Complexity: o(n), the hashmap stores an entry for all elements making it linear.
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(n) time. n = nums.length
    //handle edge cases
    if (nums == null || nums.length == 0) {
      throw new IllegalArgumentException("Cannot be null or empty");
    }

    //build map
    Map<Integer, Integer> counting = new HashMap<>();
    for (int num : nums) {
      counting.put(num, counting.getOrDefault(num, 0) + 1);
    }

    //set up variables
    int mostPut = nums[0];
    int max = 0;

    //begin iteration through array
    for (int num : nums) {
      int currentCounting = counting.get(num);
      if (currentCounting > max) {
        max = currentCounting;
        mostPut = num;
      }
    }

    return mostPut;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // TODO: Complete this method with an implementation that runs
    // in O(1) space.
    return -1;
  }
}