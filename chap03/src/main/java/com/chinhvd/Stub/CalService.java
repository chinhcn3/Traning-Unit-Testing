package com.chinhvd.Stub;

import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * Created by ChinhVD on 12/11/17.
 */
public class CalService implements Icalculator{

    @Override
    public int add(int x, int y) {
        // stub: always return value is 40 when add method is excuted
        return 40;
    }
}
