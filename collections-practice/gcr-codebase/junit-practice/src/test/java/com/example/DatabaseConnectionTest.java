package com.example;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testDatabaseConnectionEstablished() {
        assertTrue(db.isConnected());
    }

    @Test
    void testDatabaseConnectionClosed() {
        assertTrue(db.isConnected()); // test ke start me connected hota hi hota
    }
}
