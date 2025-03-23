package Zadanie1.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Zadanie1.Main.Club;

public class ClubTest {
    
    @Test
    public void testAge(){
        //Arrange
        int age = 48;
        Club club = new Club();

        boolean wiek = club.wejscie(age);

        assertTrue(wiek);
        
    }
    @Test
    public void testAge2(){
        //Arrange
        Club club = new Club();
        int age = 17;

        boolean wiek = club.wejscie(age);

        assertFalse(wiek);
        
    }


}
