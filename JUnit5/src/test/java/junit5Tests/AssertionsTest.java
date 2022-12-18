package junit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertionsTest {

    @Test
    void assertEqualsTest(){

        Assertions.assertEquals("firstString","SecondString", "The String " +
                "values were not equals");
    }

    @Test
    void assertEqualsListTest(){
        List<String> expectedValues = Arrays.asList("firstString","secondString", "thirdString");

        List<String> actualValues = Arrays.asList("firstString","secondString", "thirdString");

        Assertions.assertEquals(expectedValues,actualValues);
    }

}
