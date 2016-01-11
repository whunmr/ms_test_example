package io.uber.model;

import org.junit.Test;

import static junit.framework.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ProfileTest {
    @Test
    public void should_able_to_set_email() {
        Profile p = new Profile();
        p.setEmail("a@b.c");

        assertThat("a@b.c", is(equalTo(p.getEmail())));
    }
}

