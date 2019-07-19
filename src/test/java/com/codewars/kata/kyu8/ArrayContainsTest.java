package com.codewars.kata.kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArrayContainsTest
{
    @Test
    void sample()
    {
        assertTrue(ArrayContains.check(new Object[] { 66, 101 }, 66));
        assertTrue(ArrayContains.check(new Object[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 45));
        assertTrue(ArrayContains.check(new Object[] { 't', 'e', 's', 't' }, 'e'));
        assertFalse(ArrayContains.check(new Object[] { "what", "a", "great", "kata" }, "kat"));
    }
}
