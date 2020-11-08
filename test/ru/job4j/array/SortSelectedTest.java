package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAnother() {
        int[] input = new int[] {8, 2, 4, 1, 3, 6, 7, 5};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertThat(result, is(expected));
    }
}