package io.uber.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ITProfile {
    @Test
    public void test() {
        Profile p = new Profile();
        p.setFirstName("hello");

        assertThat("hello", is(equalTo(p.getFirstName())));
    }
}

