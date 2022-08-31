package Ex01;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LendTest {

    @Test
    void calculateFine1_a() {
        //Arrange
        Lend lend = new Lend();
        //Act
        int actual = lend.calculateFine(LocalDate.of(2022,1,1), LocalDate.of(2022, 1,2),true);
        //Assert
        assertEquals(20,actual);
    }

    @Test
    void calculateFine8_c() {
        //Arrange
        Lend lend = new Lend();
        //Act
        int actual = lend.calculateFine(LocalDate.of(2022,1,1), LocalDate.of(2022, 1,9),false);
        //Assert
        assertEquals(30,actual);
    }

    @Test
    void calculateFine30_a() {
        //Arrange
        Lend lend = new Lend();
        //Act
        int actual = lend.calculateFine(LocalDate.of(2022,1,1), LocalDate.of(2022, 2,1),true);
        //Assert
        assertEquals(90,actual);
    }
}