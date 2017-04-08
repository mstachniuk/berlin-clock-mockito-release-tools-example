package com.github.mstachniuk.berlinclock;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockTest {

    @Test
    public void shouldConvertMidnight() {
        BerlinClockTime time = BerlinClock.convertToBerlinTime("0:00:00");

        assertThat(time.getHourLineTop().getLampState(0))
                .isEqualTo(LampState.OFF);
    }
}
