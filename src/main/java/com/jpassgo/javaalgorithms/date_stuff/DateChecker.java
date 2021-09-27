package com.jpassgo.javaalgorithms.date_stuff;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDateTime;

@Component
@AllArgsConstructor
public class DateChecker {

    private Clock clock;

    public boolean isMinuteEven() {
        LocalDateTime dateTime = LocalDateTime.now(clock);

        return dateTime.getMinute() % 2 == 0;
    }
}
