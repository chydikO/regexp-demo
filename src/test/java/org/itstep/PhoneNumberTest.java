package org.itstep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberTest {
    @Test
    void isValidPhoneNumber() {
        assertTrue(PhoneNumber.isValid("+3 8 (023) 456-78-91"));
        assertTrue(PhoneNumber.isValid("3 8 (023) 456-78-91"));
        assertTrue(PhoneNumber.isValid("(023) 456-78-91"));
        assertTrue(PhoneNumber.isValid("(023)456-78-91"));
        assertTrue(PhoneNumber.isValid("(023)4567891"));
    }

    @Test
    void isInvalidPhoneNumber() {
        assertFalse(PhoneNumber.isValid("*3 8 (023) 456-78-91"));
        assertFalse(PhoneNumber.isValid("3 8 (023 456-78-91"));
        assertFalse(PhoneNumber.isValid("(023) 456-78-911"));
        assertFalse(PhoneNumber.isValid("(023)456.78-91"));
        assertFalse(PhoneNumber.isValid("(023)4567891_"));
    }
}
