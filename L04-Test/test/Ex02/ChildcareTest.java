package Ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ChildcareTest {
    private Childcare childcare;

    @BeforeEach
    void setup(){
        childcare = new Childcare();
    }

    @Test
    void totalPayment1small() {
        //Act
        int actual = childcare.totalPayment(1,0);
        //Assert
        assertEquals(2000, actual);
    }

    @Test
    void totalPayment1big() {
        //Act
        int actual = childcare.totalPayment(0,1);
        //Assert
        assertEquals(1000, actual);
    }

    @Test
    void totalPayment1big1small() {
        //Act
        int actual = childcare.totalPayment(1,1);
        //Assert
        assertEquals(2750, actual);
    }

    @Test
    void totalPayment2big() {
        //Act
        int actual = childcare.totalPayment(0,2);
        //Assert
        assertEquals(1750, actual);
    }

    @Test
    void totalPayment2small() {
        //Act
        int actual = childcare.totalPayment(2,0);
        //Assert
        assertEquals(3500, actual);
    }

    @Test
    void totalPayment2big1small() {
        //Act
        int actual = childcare.totalPayment(1,2);
        //Assert
        assertEquals(2000+1000*0.75+1000*0.75, actual);
    }

    @Test
    void totalPayment1big2small() {
        //Act
        int actual = childcare.totalPayment(2,1);
        //Assert
        assertEquals(2000+2000*0.75+1000*0.75, actual);
    }

    @Test
    void totalPayment3big() {
        //Act
        int actual = childcare.totalPayment(0,3);
        //Assert
        assertEquals(1000+1000*0.75+1000*0.75, actual);
    }

    @Test
    void totalPayment3small() {
        //Act
        int actual = childcare.totalPayment(3,0);
        //Assert
        assertEquals(2000+2000*0.75+2000*0.75, actual);
    }

    @Test
    void totalPayment4big() {
        //Act
        int actual = childcare.totalPayment(0,4);
        //Assert
        assertEquals(1000+1000*0.75+1000*0.75+1000*0.5, actual);
    }
    @Test
    void totalPayment4small() {
        //Act
        int actual = childcare.totalPayment(4,0);
        //Assert
        assertEquals(2000+2000*0.75+2000*0.75+2000*0.5, actual);
    }

    @Test
    void totalPayment2small2big() {
        //Act
        int actual = childcare.totalPayment(2,2);
        //Assert
        assertEquals(2000+2000*0.75+1000*0.75+1000*0.5, actual);
    }

    @Test
    void totalPayment2small3big() {
        //Act
        int actual = childcare.totalPayment(2,3);
        //Assert
        assertEquals(2000+2000*0.75+1000*0.75+1000*0.5+1000*0.5, actual);
    }

    @Test
    void totalPayment5small() {
        //Act
        int actual = childcare.totalPayment(5,0);
        //Assert
        assertEquals(2000+2000*0.75+2000*0.75+2000*0.5+2000*0.5, actual);
    }

    @Test
    void totalPayment5big() {
        //Act
        int actual = childcare.totalPayment(0,5);
        //Assert
        assertEquals(1000+1000*0.75+1000*0.75+1000*0.5+1000*0.5, actual);
    }


}