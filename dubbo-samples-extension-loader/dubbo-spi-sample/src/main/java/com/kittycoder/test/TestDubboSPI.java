package com.kittycoder.test;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.kittycoder.test.spi.PrintService;

/**
 * @author shucheng
 * @date 2023/2/5 21:59
 */
public class TestDubboSPI {
    // 3.调用Dubbo SPI
    public static void main(String[] args) {
        // 通过ExtensionLoader获取接口PrintService.class的默认实现
        PrintService printService = ExtensionLoader
                .getExtensionLoader(PrintService.class)
                .getDefaultExtension();

        // 此处会输出：hello world
        printService.printInfo();
    }
}
