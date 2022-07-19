package codingtheory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectErrorsTest {

    @Test
    void hemmingDistanceShouldEqual5() {
        DetectErrors err = new DetectErrors();
        assertEquals(5, err.hemmingDistance(new String[] {"00000", "11111"}, 5));
    }

    @Test
    void hemmingDistanceShouldEqual4() {
        DetectErrors err = new DetectErrors();
        assertEquals(4, err.hemmingDistance(new String[] {"32749581", "12739518"}, 8));
    }

    @Test
    void hemmingDistanceShouldEqual3() {
        DetectErrors err = new DetectErrors();
        assertEquals(3, err.hemmingDistance(new String[] {"01110", "11011"}, 5));
    }

    @Test
    void distanceShouldEqual2() {
        DetectErrors err = new DetectErrors();
        assertEquals(2, err.distance("10", "01"));
    }

    @Test
    void distanceShouldEqual4() {
        DetectErrors err = new DetectErrors();
        assertEquals(4, err.distance("1010", "0101"));
    }

    @Test
    void correctErrorsShouldEqual2() {
        DetectErrors err =new DetectErrors();
        assertEquals(2, err.correctErrors(5));
    }

    @Test
    void detectErrorsShouldEqual4() {
        DetectErrors err =new DetectErrors();
        assertEquals(4, err.detectErrors(5));
    }

    @Test
    void isBinaryShouldEqualTrue() {
        DetectErrors err = new DetectErrors();
        assertEquals(true, err.isBinary(1001));
    }

    @Test
    void isBinaryShouldEqualFalse() {
        DetectErrors err = new DetectErrors();
        assertEquals(false, err.isBinary(10031));
    }
}