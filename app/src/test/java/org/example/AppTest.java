package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void testLinearSearchFindsGold() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.randomizedRainbowFuzzies();

    int index = App.linearSearchGold(list);
    assertTrue(index >= 0);
    assertEquals("gold", list.get(index).color);
  }

  @Test
  void testBinarySearchFindsGold() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.sortedRainbowFuzzies();

    int index = App.binarySearchGold(list);
    assertTrue(index >= 0);
    assertEquals("gold", list.get(index).color);
  }
}
