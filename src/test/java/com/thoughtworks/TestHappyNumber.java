package com.thoughtworks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHappyNumber {

    HappyNumber happyNumber;

    @BeforeEach
    void setup() {
        happyNumber = new HappyNumber();
    }

    @Test
    void GivenNumberZero_WhenCheck_MustBeChecked() {

        int number = 0;

        assertFalse(happyNumber.check(number));
    }

    @Test
    void GivenNumberOne_WhenCheck_MustBeChecked() {

        int number = 1;

        assertFalse(happyNumber.check(number));
    }

    @Test
    void GivenNumberTwo_WhenCheck_MustBeChecked() {

        int number = 2;

        assertEquals(true, new HappyNumber().check(number));
    }
}
