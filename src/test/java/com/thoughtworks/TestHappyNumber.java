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

        assertEquals(false, happyNumber.check(number));
    }

    @Test
    void GivenNumberOne_WhenCheck_MustBeChecked() {

        int number = 1;

        assertEquals(false, happyNumber.check(number));
    }
}
