package com.jpassgo.javaalgorithms.date_stuff;

import java.time.LocalDateTime;

public class DateChecker {

    public String isMinuteEven() {
        LocalDateTime dateTime = LocalDateTime.now();

        boolean isEven = switch (dateTime) {
            case dateTime.getMinute() % 2 == 0 -> "minute is even";
            case dateTime.getMinute() % 2 != 0 -> "minute is odd";
            default -> "Something went wrong here";
        };
    }
}
