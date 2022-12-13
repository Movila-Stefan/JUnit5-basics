package junit5Tests;
import org.junit.jupiter.api.*;
public class RepeatedTest {

    @org.junit.jupiter.api.RepeatedTest(5)
     void firstRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @org.junit.jupiter.api.RepeatedTest(value = 3, name = "Running repetition: {currentRepetition}. " +
    "Total is: {totalRepetitions}")
    @DisplayName("This is a repeated test method")
    void secondRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @org.junit.jupiter.api.RepeatedTest(3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo){
        System.out.println("this code will run at each repetition");
        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 3,
                () -> System.out.println("this only runs for repetition " + "3"));
    }


}
