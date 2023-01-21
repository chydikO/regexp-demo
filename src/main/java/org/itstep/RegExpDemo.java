package org.itstep;

public class RegExpDemo {
    public static void main(String[] args) {
        // метди ряків, що підтримуют регулярні вирази
        // matches()
        String[] strings = {
                "1", "+1", "-2", "+-1", "-+1", "1.0", "+1.0", "+-1.0", "+1.a", "1.123"
        };
        for (String str: strings) {
            System.out.println(str + ": " + isValidNumber(str));
        }
    }

    static boolean isValidNumber(String str) {
        return str.matches("(\\+|-)?\\d+\\.?\\d*");
    }
}
