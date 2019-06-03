package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromesTest {

  @Test
  public void isPalindrome() {

    assertTrue(Palindromes.isPalindrome("the bat smokes rocks and cocks"));
  }
}