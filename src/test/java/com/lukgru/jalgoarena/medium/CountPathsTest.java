package com.lukgru.jalgoarena.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-12.
 */
public class CountPathsTest {

    private CountPaths countPaths = new CountPaths();

    @Test
    public void test1() {
        //given
        int m = 1;
        int n = 1;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(1, paths);
    }

    @Test
    public void test2() {
        //given
        int m = 7;
        int n = 15;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(38760, paths);
    }

    @Test
    public void test3() {
        //given
        int m = 10;
        int n = 12;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(167960, paths);
    }

    @Test
    public void test4() {
        //given
        int m = 2;
        int n = 2;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(2, paths);
    }

    @Test
    public void test5() {
        //given
        int m = 1;
        int n = 0;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(0, paths);
    }

    @Test
    public void test6() {
        //given
        int m = 5;
        int n = 3;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(15, paths);
    }
    @Test
    public void test7() {
        //given
        int m = 0;
        int n = 1;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(0, paths);
    }
    @Test
    public void test8() {
        //given
        int m = 12;
        int n = 6;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(4368, paths);
    }

    @Test
    public void test9() {
        //given
        int m = 18;
        int n = 17;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(1166803110, paths);
    }

    @Test
    public void test10() {
        //given
        int m = 4;
        int n = 1;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(1, paths);
    }

    @Test
    public void test11() {
        //given
        int m = 8;
        int n = 10;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(11440, paths);
    }

    @Test
    public void test12() {
        //given
        int m = 0;
        int n = 0;
        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(0, paths);
    }

    @Test
    public void test13() {
        //given
        int m = 15;
        int n = 16;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(77558760, paths);
    }

    @Test
    public void test14() {
        //given
        int m = 3;
        int n = 5;

        //when
        int paths = countPaths.countPaths(m, n);

        //then
        assertEquals(15, paths);
    }

}