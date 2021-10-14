package com.daniel.javachallenge.quadruplets;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class ProgramTest {

    @Test
    public void testCase1() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16);
        assertThat(combinations.size(), equalTo(2));
        assertThat(combinations, hasItems(
                arrayContaining(7, 6, 4, -1),
                arrayContaining(7, 6, 1, 2)
        ));
    }

    @Test
    public void testCase2() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 10);
        assertThat(combinations.size(), equalTo(1));
        assertThat(combinations, contains(
                arrayContaining(1, 2, 3, 4)
        ));
    }

    @Test
    public void testCase3() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{5, -5, -2, 2, 3, -3}, 0);
        assertThat(combinations.size(), equalTo(3));
        assertThat(combinations, hasItems(
                arrayContaining(5, -5, -2, 2),
                arrayContaining(5, -5, 3, -3),
                arrayContaining(-2, 2, 3, -3)
        ));
    }

    @Test
    public void testCase4() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4);
        assertThat(combinations.size(), equalTo(4));
        assertThat(combinations, hasItems(
                arrayContaining(-2, -1, 1, 6),
                arrayContaining(-2, 1, 2, 3),
                arrayContaining(-2, -1, 2, 5),
                arrayContaining(-2, -1, 3, 4)
        ));
    }

    @Test
    public void testCase5() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{-1, 22, 18, 4, 7, 11, 2, -5, -3}, 30);
        assertThat(combinations.size(), equalTo(5));
        assertThat(combinations, hasItems(
                arrayContaining(-1, 22, 7, 2),
                arrayContaining(22, 4, 7, -3),
                arrayContaining(-1, 18, 11, 2),
                arrayContaining(18, 4, 11, -3),
                arrayContaining(22, 11, 2, -5)
        ));
    }
    @Test
    public void testCase6() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5}, 20);
        assertThat(combinations.size(), equalTo(7));
        assertThat(combinations, hasItems(
                arrayContaining(-5, 2, 15, 8),
                arrayContaining(-3, 2, -7, 28),
                arrayContaining(-10, -3, 28, 5),
                arrayContaining(-10, 28, -6, 8),
                arrayContaining(-7, 28, -6, 5),
                arrayContaining(-5, 2, 12, 11),
                arrayContaining(-5, 12, 8, 5)
        ));
    }

    @Test
    public void testCase7() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5}, 100);
        assertThat(combinations.size(), equalTo(0));
    }

    @Test
    public void testCase8() {
        List<Integer[]> combinations = Program.fourNumberSum(new int[]{1, 2, 3, 4, 5, -5, 6, -6}, 5);
        assertThat(combinations.size(), equalTo(6));
        assertThat(combinations, hasItems(
                arrayContaining(2, 3, 5, -5),
                arrayContaining(1, 4, 5, -5),
                arrayContaining(2, 4, 5, -6),
                arrayContaining(1, 3, -5, 6),
                arrayContaining(2, 3, 6, -6),
                arrayContaining(1, 4, 6, -6)
        ));
    }
}