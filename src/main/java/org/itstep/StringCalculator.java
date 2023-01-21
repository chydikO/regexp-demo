package org.itstep;

public class StringCalculator {
    public static int add(String arg) {
        if (arg == null || arg.isBlank()) {
            return 0;
        }
        String[] parts = arg.split("\\D");
        int sum = 0;
        for(String part: parts) {
            if(part.isBlank()) {
                continue;
            }
            sum += Integer.parseInt(part.trim());
        }
        return sum;
    }
}
