package junit5Tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam) {
        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @NullAndEmptySource // face ce fac cele de mai jos
 //   @NullSource
 //   @EmptySource
    @ValueSource(strings = {"firstString", "secondString"})
    void stringValues(String theParam){

        System.out.println("theParam = " + theParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers", "capitan,marvel", "bucky,barnes"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,32,true", "capitan,21,false", "bucky,5,true"})
    void csvSurce_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"captain america, 'steve,rogers'", "winter solder,"+"'bucky, barnes'"})
    void csvSource_StringWithComa(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers", "bucky?barnes"}, delimiter = '?')
        void csvSource_StringWithDiffDelimiter(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv","src/test/resources/params/shoppinglist2.csv"}, numLinesToSkip = 1)
    void csvFileSource_StringDoubleIntStringString(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
        System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    }

    // un singur delimiter pentru metoda
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/shoppinglist3.csv", numLinesToSkip = 1, delimiterString = "___")
    void csvFileSource_StringDoubleIntStringStringSpecifiedDelimiter(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
        System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
    }

}