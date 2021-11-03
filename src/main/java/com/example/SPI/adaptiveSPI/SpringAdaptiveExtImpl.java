package com.example.SPI.adaptiveSPI;

import com.alibaba.dubbo.common.URL;

public class SpringAdaptiveExtImpl implements AdaptiveExt{
    @Override
    public String echo(String msg, URL url) {
        return "spring";
    }
}
