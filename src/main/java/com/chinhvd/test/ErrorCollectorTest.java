package com.chinhvd.test.utils;

/**
 * Created by ChinhVD on 12/7/17.
 */
public class ErrorCollectorTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Test
    public void fails_after_execution() {
        collector.checkThat("a", equalTo("b"));
        collector.checkThat(1, equalTo(2));

    }
