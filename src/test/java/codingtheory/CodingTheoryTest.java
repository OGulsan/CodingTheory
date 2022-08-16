package codingtheory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingTheoryTest {

    @Test
    void hemmingDistanceShouldEqual5() {
        CodingTheory err = new CodingTheory();
        assertEquals(5, err.hemmingDistance(new String[] {"00000", "11111"}, 5));
    }

    @Test
    void hemmingDistanceShouldEqual4() {
        CodingTheory err = new CodingTheory();
        assertEquals(4, err.hemmingDistance(new String[] {"32749581", "12739518"}, 8));
    }

    @Test
    void hemmingDistanceShouldEqual3() {
        CodingTheory err = new CodingTheory();
        assertEquals(3, err.hemmingDistance(new String[] {"01110", "11011"}, 5));
    }

    @Test
    void distanceShouldEqual2() {
        CodingTheory err = new CodingTheory();
        assertEquals(2, err.distance("10", "01"));
    }

    @Test
    void distanceShouldEqual4() {
        CodingTheory err = new CodingTheory();
        assertEquals(4, err.distance("1010", "0101"));
    }

    @Test
    void correctErrorsShouldEqual2() {
        CodingTheory err =new CodingTheory();
        assertEquals(2, err.correctErrors(5));
    }

    @Test
    void detectErrorsShouldEqual4() {
        CodingTheory err =new CodingTheory();
        assertEquals(4, err.detectErrors(5));
    }

    @Test
    void isBinaryShouldEqualTrue() {
        CodingTheory err = new CodingTheory();
        assertEquals(true, err.isBinary(1001));
    }

    @Test
    void isBinaryShouldEqualFalse() {
        CodingTheory err = new CodingTheory();
        assertEquals(false, err.isBinary(10031));
    }
}