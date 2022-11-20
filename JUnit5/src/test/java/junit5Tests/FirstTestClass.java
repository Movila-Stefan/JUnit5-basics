package junit5Tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {

    @BeforeAll
    void beforeAll(){
        System.out.println("--this is the before All method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("----This is the before Each method");
    }

    @AfterAll
    void afeterAll(){
        System.out.println("-- this is the after All method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("----this is the after Each method");
    }

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