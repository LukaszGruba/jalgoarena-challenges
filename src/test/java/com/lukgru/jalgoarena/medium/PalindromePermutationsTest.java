package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-12.
 */
public class PalindromePermutationsTest {

    private PalindromePermutations palindromePermutations = new PalindromePermutations();

    @Test
    public void givenEmptyStringReturnFalse() {
        //given
        String input = "";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertFalse(result);
    }

    @Test
    public void givenSingleCharacterReturnTrue() {
        //given
        String input = "a";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }

    @Test
    public void givenEvenCharactersWithMoreThanOneUniqueShouldReturnFalse() {
        //given
        String input = "cxzwcxzwcxzwcxzwab";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertFalse(result);
    }

    @Test
    public void givenOddCharactersWithOneUniqueShouldReturnTrue() {
        //given
        String input = "cxzwcxzwcxzwcxzwa";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldIgnoreLetterCase() {
        //given
        String input = "Aa";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldIgnoreNonLetterCharacters() {
        //given
        String input = "Tact Coa&";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldIgnoreSpaces() {
        //given
        String input = "Tact Coa";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldWorkForSingleWord() {
        //given
        String input = "abcabcd";

        //when
        boolean result = palindromePermutations.isPermutationOfPalindrome(input);

        //then
        assertTrue(result);
    }
}