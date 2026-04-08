package com.google;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxInputTest {

    @Test
    void testMax1() {
        assertEquals(30, MaxInput.findMax(10, 30, 20));
    }

    @Test
    void testMax2() {
        assertEquals(50, MaxInput.findMax(50, 10, 20));
    }

    @Test
    void testMax3() {
        assertEquals(40, MaxInput.findMax(10, 20, 40));
    }
}