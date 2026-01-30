package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    // Valid user
    @Test
    void testValidRegistration() {
        assertTrue(
            registration.registerUser("gaurav", "gaurav@mail.com", "Password1")
        );
    }

    // Invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("ga", "test@mail.com", "Password1");
        });
    }

    //  Invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("gaurav", "mail.com", "Password1");
        });
    }

    //  Invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("gaurav", "test@mail.com", "pass");
        });
    }
}
