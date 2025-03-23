package Zadanie0.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Zadanie0.Main.*;

public class Hellotest {
    @Test
    public void meh(){
        //Arrange
        HelloWorld hejka = new HelloWorld();
        //Act
        String greeting = hejka.getGreeting();
        //Assert
        assertEquals("HelloWorld!!ggone",greeting);
        
    }
}
