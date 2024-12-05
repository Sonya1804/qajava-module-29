package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testIsTeenager_validAge() {
        assertTrue(Person.isTeenager(15)); // Correctly identifies a teenager
        assertTrue(Person.isTeenager(13)); //Edge case - lower bound
        assertTrue(Person.isTeenager(19)); //Edge case - upper bound
    }

    @Test
    void testIsTeenager_tooYoung() {
        assertFalse(Person.isTeenager(12)); // Correctly identifies someone too young
        assertFalse(Person.isTeenager(0));   // Another case of someone too young
    }

    @Test
    void testIsTeenager_tooOld() {
        assertFalse(Person.isTeenager(20)); // Correctly identifies someone too old
        assertFalse(Person.isTeenager(30)); // Another case of someone too old

    }


    @Test
    void testIsTeenager_boundaryConditions(){
        //This test case is added to explicitly check for potential off-by-one errors in the age range check

        assertTrue(Person.isTeenager(13)); //Lower bound inclusive
        assertTrue(Person.isTeenager(19)); //Upper bound inclusive
        assertFalse(Person.isTeenager(12)); //Lower bound exclusive
        assertFalse(Person.isTeenager(20)); //Upper bound exclusive
    }

}