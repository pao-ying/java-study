package com.example.SPI.adaptiveSPI;

import com.alibaba.dubbo.common.URL;

public class DubboAdaptiveExtImpl implements AdaptiveExt{
    @Override
    public String echo(String msg, URL url) {
        return "dubbo";
    }
}
