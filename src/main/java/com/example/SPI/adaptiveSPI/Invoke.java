package com.example.SPI.adaptiveSPI;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class Invoke {
    public static void main(String[] args) {
        ExtensionLoader<AdaptiveExt> extExtensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveExt.class);
        AdaptiveExt adaptiveExt = extExtensionLoader.getAdaptiveExtension();
        URL url = URL.valueOf("test://localhost/test?adaptive.ext=spring");
        System.out.println(adaptiveExt.echo("something", url));
    }
}
