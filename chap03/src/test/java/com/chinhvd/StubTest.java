package com.chinhvd;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Created by ChinhVD on 12/11/17.
 */
public class StubTest {
    @Test
    public void with_arguments(){
        Comparable c=mock(Comparable.class);
        when(c.compareTo("Test")).thenReturn(1);
        assertEquals(1,c.compareTo("Test"));
    }
}
