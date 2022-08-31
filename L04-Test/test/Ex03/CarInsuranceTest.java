package Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {

    @Test
    void calculatePremium18() {
        //arrange
        CarInsurance car = new CarInsurance(1000);
        //act
        double actual = car.calculatePremium(18,false,0);
        //assert
        assertEquals(1250, actual, 0.0001);
    }

    @Test
    void calculatePremium24_6(){
        //arrange
        CarInsurance car = new CarInsurance(1000);
        //act
        double actual = car.calculatePremium(24,false,6);
        //assert
        assertEquals(1000, actual, 0.0001);
    }

    @Test
    void calculatePremium25_w_3(){
        //arrange
        CarInsurance car = new CarInsurance(1000);
        //act
        double actual = car.calculatePremium(25,true,3);
        //assert
        assertEquals(800, actual, 0.0001);
    }

    @Test
    void calculatePremiumRuntimeex(){
        //arrange
        CarInsurance car = new CarInsurance(1000);
        //act & assert
        Exception exception = assertThrows(RuntimeException.class, () -> car.calculatePremium(17,false,6));
        assertEquals("Age or years without damage is invalid", exception.getMessage());
    }
}