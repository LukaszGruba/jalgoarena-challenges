package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-11.
 */
public class StringToIntegerTest {

    private StringToInteger stringToInteger = new StringToInteger();

    @Test
    public void givenNullShouldReturnZero() {
        //given
        String input = null;

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(0, result);
    }

    @Test
    public void givenOneDigitShouldConvertProperly() {
        //given
        String input = "1";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(1, result);
    }

    @Test
    public void givenBigNumberShouldConvertProperly() {
        //given
        String input = "123";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(123, result);
    }

    @Test
    public void shouldIgnoreLeadingZeros() {
        //given
        String input = "010";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(10, result);
    }

    @Test
    public void givenNumberWithPlusShouldConvertProperly() {
        //given
        String input = "+1";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(1, result);
    }

    @Test
    public void givenNegativeDigitShouldConvertProperly() {
        //given
        String input = "-1";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(-1, result);
    }

    @Test
    public void givenNegativeBigNumberShouldConvertProperly() {
        //given
        String input = "-123";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(-123, result);
    }

    @Test
    public void givenPlusAndMinusShouldReturnZero() {
        //given
        String input = "+-2";

        //when
        int result = stringToInteger.stoi(input);

        //then
        assertEquals(0, result);
    }

}