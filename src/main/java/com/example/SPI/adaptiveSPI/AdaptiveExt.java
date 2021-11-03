package com.example.SPI.adaptiveSPI;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface AdaptiveExt {
    @Adaptive
    String echo(String msg, URL url);
}
