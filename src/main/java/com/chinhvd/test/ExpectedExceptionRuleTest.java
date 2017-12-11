package com.chinhvd.test.utils;

/**
 * Created by ChinhVD on 12/7/17.
 */
public class ExpectedExceptionRuleTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();
    @Test
    public void throwsNothing() {
    }
    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }
    @Test
    public void throwsIllegalStateExceptionWithMessage() {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Is this a legal state?");
}
