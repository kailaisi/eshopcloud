package com.kailaisi.minusserver;

import com.kailaisi.customizeapi.MinusException;
import com.kailaisi.customizeapi.MinusService;

public class MinusServiceNotSupportNegativeImpl implements MinusService {

    /**
     * 减法运算，不支持负数结果，如果被减数小于减数，就跑出MinusException
     * @param minuend 被减数
     * @param subtraction 减数
     * @return
     * @throws MinusException
     */
    public int minus(int minuend, int subtraction) throws MinusException {
        if(subtraction>minuend){
            throw new MinusException("not support negative!");
        }

        return minuend-subtraction;
    }
}