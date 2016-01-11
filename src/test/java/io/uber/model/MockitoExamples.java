package io.uber.model;


import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class MockitoExamples {
    //http://www.vogella.com/tutorials/Mockito/article.html

    @Test
    public void test1()  {
        Profile profile = Mockito.mock(Profile.class);
        when(profile.getFirstName()).thenReturn("hello");

        assertThat("hello", is(equalTo(profile.getFirstName())));
    }


    @Test
    public void testMoreThanOneReturnValue()  {
        Iterator i= mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result=i.next()+" "+i.next();
        //assert
        assertEquals("Mockito rocks", result);
    }


    @Test
    public void testReturnValueDependentOnMethodParameter()  {
        Comparable c= mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1,c.compareTo("Mockito"));
    }


    @Test
    public void testReturnValueInDependentOnMethodParameter()  {
        Comparable c= mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        assertEquals(-1 ,c.compareTo(9));
    }


    @Test
    public void testVerify()  {
        // create and configure mock
        Profile p = Mockito.mock(Profile.class);

        // call method testing on the mock with parameter 12
        p.setFirstName("hello");

        verify(p).setFirstName(Matchers.eq("hello"));
    }

}
