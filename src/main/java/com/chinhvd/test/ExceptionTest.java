package com.chinhvd.test;

import org.junit.Test;

/**
 * Created by ChinhVD on 12/7/17.
 */
public class Exception {
    @Test(expected = RuntimeException.class)
    public void exception() {
        throw new RuntimeException();
    }
}
