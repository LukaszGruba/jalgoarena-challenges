package com.lukgru.jalgoarena.hard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Łukasz on 2016-11-15.
 */
public class BoggleSearchTest {

    private BoggleSearch boggleSearch = new BoggleSearch();

    @Test
    public void test1() {
        //given
        String word = "JACKET";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertFalse(found);
    }

    @Test
    public void test2() {
        //given
        String word = "FIRES";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }


    @Test
    public void test3() {
        //given
        String word = "FIRECODE";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test4() {
        //given
        String word = "ROCK";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test5() {
        //given
        String word = "HELLO";
        char[][] board = {
                {'A','O','L'},
                {'D','E','L'},
                {'G','H','I'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test6() {
        //given
        String word = "SEE";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test7() {
        //given
        String word = "JACK";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test8() {
        //given
        String word = "AXE";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertFalse(found);
    }

    @Test
    public void test9() {
        //given
        String word = "ROCKS";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

    @Test
    public void test10() {
        //given
        String word = "DFS";
        char[][] board = {
                {'A','F','A','J'},
                {'S','I','V','A'},
                {'E','R','O','C'},
                {'C','X','E','K'},
                {'O','D','F','S'},
                {'D','E','E','E'}
        };

        //when
        boolean found = boggleSearch.boggleSearch(board, word);

        //then
        assertTrue(found);
    }

}