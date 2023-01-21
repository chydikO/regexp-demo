package org.itstep;

import java.util.regex.Pattern;

public class PhoneNumber {
    public static boolean isValid(String string) {
        return Pattern.matches("\\+?3?\\s?8?\\s?\\(\\d{3}\\)\\s?\\d{3}-?\\d{2}-?\\d{2}$", string);
    }
}
