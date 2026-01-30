package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    // Valid Password
    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongP4ss"));
    }

    //  Less than 8 characters
    @Test
    void testShortPassword() {
        assertFalse(validator.isValid("Abc12"));
    }

    //  No uppercase
    @Test
    void testNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    //  No digit
    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    //  Null password
    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
