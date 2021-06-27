 

import org.junit.Assert;
import org.junit.Test;

public class NumberUtilitiesTest {
    
    @Test
    public void testGetRangeForSmallRange() {
        // : Given
        String expected = "012";
        int stop = 3;

        // : When
        String actual = NumberUtilities.getRange(stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void testGetRangeToTwoDigits() {
        // : Given
        String expected = "01234567891011";
        int stop = 12;

        // : When
        String actual = NumberUtilities.getRange(stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRangeWithAStartNumber() {
        // : Given
        String expected = "5678910111213141516171819";
        int start = 5;
        int stop = 20;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRangeStartAt100() {
        // : Given
        String expected = "100101102103104105106107108109";
        int start = 100;
        int stop = 110;

        // : When
        String actual = NumberUtilities.getRange(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    
    @Test
    public void testGetRangeWithOneStep() {
        // : Given
        String expected = "012345678910111213141516171819";
        int start = 0;
        int stop = 20;
        int step = 1;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetRangeWithTwoStep() {
        // : Given
        String expected = "0246810";
        int start = 0;
        int stop = 11;
        int step = 2;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }

        @Test
    public void testGetRangeWithFiveStep() {
        // : Given
        String expected = "102540557085";
        int start = 10;
        int stop = 100;
        int step = 15;

        // : When
        String actual = NumberUtilities.getRange(start, stop, step);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    
    @Test
    public void testGetEvenNumbersStartAndEndAtEven() {
        // : Given
        String expected = "1618202224262830";
        int start = 16;
        int stop = 32;

        // : When
        String actual = NumberUtilities.getEvenNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    
    @Test
    public void testGetEvenNumbersStartAndEndAtOdd() {
        // : Given
        String expected = "121416182022242628303234";
        int start = 11;
        int stop = 35;

        // : When
        String actual = NumberUtilities.getEvenNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    
    @Test
    public void testGetOddNumbersStartAndEndAtOdd() {
        // : Given
        String expected = "555759616365";
        int start = 55;
        int stop = 67;

        // : When
        String actual = NumberUtilities.getOddNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    public void testGetOddNumbersStartAndEndAtEven() {
        // : Given
        String expected = "31333537394143454749";
        int start = 30;
        int stop = 50;

        // : When
        String actual = NumberUtilities.getOddNumbers(start, stop);

        // : Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetExponentiationNumbersForSquare() {
        // : Given
        String expected = "1491625";
        int start = 1;
        int stop = 5;
        int exponent = 2;

        // : When
        String actual = NumberUtilities.getExponentiations(start, stop, exponent);

        // : Then
        Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void testGetExponentiationNumbersForCube() {
        // : Given
        String expected = "625129624014096656110000";
        int start = 5;
        int stop = 10;
        int exponent = 4;

        // : When
        String actual = NumberUtilities.getExponentiations(start, stop, exponent);

        // : Then
        Assert.assertEquals(expected, actual);
    }
}
