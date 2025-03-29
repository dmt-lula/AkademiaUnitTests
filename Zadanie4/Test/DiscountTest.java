package Zadanie4.Test;

import Zadanie4.Main.Discount;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.CsvSource;

public class DiscountTest {

        @ParameterizedTest
        @CsvSource({"6,6","5000,5000","5001,3500","4000,4000"})
        void calculateDiscountTest(double dOrder, double dPrice){
            //Arrange
            Discount app = new Discount();
            //Act
            double result app.calculateDiscount(dOrder);
            //Assert
            assertEquals(dPrice,result,0.1);

    }
}
