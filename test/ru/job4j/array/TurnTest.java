package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class TurnTest {

    @Test
    public void when12345Then54321() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expected));
    }
}