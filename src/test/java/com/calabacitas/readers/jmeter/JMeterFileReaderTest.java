package com.calabacitas.readers.jmeter;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class JMeterFileReaderTest {

    @Test
    public void SomeTest() {
        String expected = "Hola";
        String actual = "Hola";

        assertThat(actual, containsString(expected));
    }
}
