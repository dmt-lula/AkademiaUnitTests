package Zadanie4.Test;

import Zadanie4.Main.Discount;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.CsvSource;

public class DiscountTest {

        @ParameterizedTest
        @CsvSource({
            "0,0",
            "1,1",
            "5000,5000",
            "5001,3500.7",
            "15000,10500",
            "15001,9000.6",
            "49999,29999.40",
            "50000,30000",
            "50001,10000.20",
            "60000,12000",
            "500000,100000"
        })
        void calculateDiscountTest(double dWartosc, double dPoRabacie){
            //Arrange
            Discount app = new Discount();
            //Act
            double result = app.calculateDiscount(dWartosc);
            //Assert
            assertEquals(dPoRabacie,result,0.01);

            

    }
}
