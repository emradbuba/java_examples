package io.github.guit4rfre4k.examples.codewars.rangeextraction;

import org.junit.Test;
import org.testng.Assert;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceWithoutRanges() {
        int[] inputArray = new int[]{1, 3, 5, 7, 9};
        String expectedOutput = "1,3,5,7,9";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceWithoutRangesOfThree() {
        int[] inputArray = new int[]{1, 2, 4, 5, 7, 8};
        String expectedOutput = "1,2,4,5,7,8";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceAllInRange() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String expectedOutput = "1-10";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceWithRangeInside() {
        int[] inputArray = new int[]{1, 3, 5, 6, 7, 8, 10};
        String expectedOutput = "1,3,5-8,10";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceWithRangeAtTheBeginning() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 7, 8, 10};
        String expectedOutput = "1-5, 7, 8,10";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForPositiveSequenceWithRangeAtTheEnd() {
        int[] inputArray = new int[]{1, 3, 5, 6, 8, 9, 10};
        String expectedOutput = "1,3,5,6,8-10";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForMinusOneToPlusOneSequence() {
        int[] inputArray = new int[]{-1, 0, 1};
        String expectedOutput = "-1-1";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForTwoRangesWithNegatives() {
        int[] inputArray = new int[]{-5, -4, -3, -1, 0, 1, 2, 3};
        String expectedOutput = "-5--3,-1-3";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultWithDoubleMinusSign() {
        int[] inputArray = new int[]{-9, -8, -7, -5, -4, -3, -1};
        String expectedOutput = "-9--7,-5--3,-1";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForOneElement() {
        int[] inputArray = new int[]{-6};
        String expectedOutput = "-6";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultForTwoElements() {
        int[] inputArray = new int[]{-6, -5};
        String expectedOutput = "-6, -5";

        String actualResult = Solution.rangeExtraction(inputArray);
        Assert.assertEquals(expectedOutput, actualResult);
    }
}