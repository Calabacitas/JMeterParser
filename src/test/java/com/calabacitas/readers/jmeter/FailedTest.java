package com.calabacitas.readers.jmeter;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FailedTest {

    @Test
    public void restaPositivos() {
        int result = 5 + 1;
        int expectedValue = 4;
        assertThat(result, equalTo(expectedValue));
    }
}
