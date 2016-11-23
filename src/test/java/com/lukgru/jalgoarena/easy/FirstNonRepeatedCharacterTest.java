package com.lukgru.jalgoarena.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-23.
 */
public class FirstNonRepeatedCharacterTest {

    private FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();

    @Test
    public void test1() {
        //given
        String input = null;

        //when
        String output = firstNonRepeatedCharacter.findFirstNonRepeatedChar(input);

        //then
        assertNull(output);
    }

    @Test
    public void test2() {
        //given
        String input = "";

        //when
        String output = firstNonRepeatedCharacter.findFirstNonRepeatedChar(input);

        //then
        assertNull(output);
    }

    @Test
    public void test3() {
        //given
        String input = "asdsdakz";

        //when
        String output = firstNonRepeatedCharacter.findFirstNonRepeatedChar(input);

        //then
        String expected = "k";
        assertEquals(expected, output);
    }

    @Test
    public void test4() {
        //given
        String input = "asdsda";

        //when
        String output = firstNonRepeatedCharacter.findFirstNonRepeatedChar(input);

        //then
        assertNull(output);
    }

    @Test
    public void test5() {
        //given
        String input = "asd";

        //when
        String output = firstNonRepeatedCharacter.findFirstNonRepeatedChar(input);

        //then
        String expected = "a";
        assertEquals(expected, output);
    }
}