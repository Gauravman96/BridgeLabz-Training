package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    //  Valid date
    @Test
    void testValidDate() {
        assertEquals("30-01-2026", formatter.formatDate("2026-01-30"));
    }

    //  Invalid format
    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("30/01/2026");
        });
    }

    //  Invalid date value
    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2026-13-01");
        });
    }
}
