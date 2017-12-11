package com.chinhvd;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by ChinhVD on 12/8/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class StockBrokerTest {
    @Mock
    MarketWatcher marketWatcher;
    @Mock
    Portfolio portfolio;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void sanity() throws Exception {
        assertNotNull(marketWatcher);
        assertNotNull(portfolio);
    }
}
