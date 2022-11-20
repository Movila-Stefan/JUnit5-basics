package junit5Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    void firstMethod() {
        System.out.println("first test method");
    }

    @Test
    @DisplayName("US1234 - TC12 - this method is the second one ")
    void secondMethod() {
        {
            System.out.println("second method");
        }

    }
}