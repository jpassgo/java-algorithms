package com.jpassgo.javaalgorithms.date_stuff;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.*;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class DateCheckerTest {

    @Mock Clock clock;
    @InjectMocks DateChecker dateChecker;

    private final static LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(2021, 01, 01, 01, 9);

    @Test
    void isMinuteEven() {
        clock.fixed(LOCAL_DATE_TIME.toInstant(ZoneOffset.MIN), ZoneId.systemDefault());

        assertThat(dateChecker.isMinuteEven()).isTrue();

    }


}