package com.jpassgo.javaalgorithms.date_stuff;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DateCheckerTest {

  @Mock Clock clock;
  @InjectMocks DateChecker dateChecker;

  private static final LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(2021, 01, 01, 01, 9);

  @Test
  void isMinuteEven() {
    clock.fixed(LOCAL_DATE_TIME.toInstant(ZoneOffset.MIN), ZoneId.systemDefault());

    assertThat(dateChecker.isMinuteEven()).isTrue();
  }
}
