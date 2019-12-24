package com.kailaisi.minusserver;

import com.kailaisi.customizeapi.MinusException;
import com.kailaisi.customizeapi.MinusService;

public class MinusServiceSupportNegativeImpl implements MinusService {

    /**
     * 减法实现，支持负数
     * @param minuend 减数
     * @param subtraction 被减数
     * @return
     * @throws MinusException
     */
    public int minus(int minuend, int subtraction) throws MinusException {
        return minuend - subtraction;
    }
}