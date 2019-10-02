package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHappyNumber {

    @Test
    void GivenNumberZero_WhenCheck_MustBeChecked() {
        HappyNumber happyNumber = new HappyNumber();
        int number = 0;
        Assertions.assertEquals(false, happyNumber.check(number));
    }

    @Test
    void GivenNumberOne_WhenCheck_MustBeChecked() {
        HappyNumber happyNumber = new HappyNumber();
        int number = 1;
        Assertions.assertEquals(false, happyNumber.check(number));
    }
}
