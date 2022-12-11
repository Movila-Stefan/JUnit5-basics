package junit5Tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class DisabledEnabledTest {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled")
    void firstTest(){
        System.out.println("This is the firest test method");
    }

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of"+
    "@DisabledOnOs")
    void secondTest(){
        System.out.println("This is the second test method");
    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "staging")
    void thirdTest(){
        System.out.println("This is the third test method");
    }

    @Test
    void forthTest(){
        System.out.println("This is the forth test method");
    }

    @Test
    void fifthTest(){
        System.out.println("This is the fifth test method");
    }

}
