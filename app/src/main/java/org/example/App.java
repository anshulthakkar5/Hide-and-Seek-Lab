package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

    FuzzyListGenerator generator = new FuzzyListGenerator();

    
    ArrayList<Fuzzy> randomList = generator.randomizedRainbowFuzzies();
    int linearIndex = linearSearchGold(randomList);
    System.out.println("Linear Search (random list): " + linearIndex);

   
    ArrayList<Fuzzy> sortedList = generator.sortedRainbowFuzzies();
    int binaryIndex = binarySearchGold(sortedList);
    System.out.println("Binary Search (sorted list): " + binaryIndex);
  }

  
  public static int linearSearchGold(ArrayList<Fuzzy> fuzzies) {
    for (int i = 0; i < fuzzies.size(); i++) {
      if (fuzzies.get(i).color.equals("gold")) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearchGold(ArrayList<Fuzzy> fuzzies) {
    int left = 0;
    int right = fuzzies.size() - 1;

    while (left <= right) {
      int mid = (left + right) / 2;
      String color = fuzzies.get(mid).color;

      if (color.equals("gold")) {
        return mid;
      } else if (color.compareTo("gold") < 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
