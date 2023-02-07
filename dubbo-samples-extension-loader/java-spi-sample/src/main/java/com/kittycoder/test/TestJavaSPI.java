package com.kittycoder.test;

import com.kittycoder.test.spi.PrintService;

import java.util.ServiceLoader;

/**
 * @author shucheng
 * @date 2023/2/5 21:59
 */
public class TestJavaSPI {
    // 3.调用SPI具体的实现
    public static void main(String[] args) {
        ServiceLoader<PrintService> serviceLoader = ServiceLoader.load(PrintService.class);
        /**
         * 获取所有的SPI实现，循环调用printInfo()方法，会打印出hello world，
         * 此处只有一个实现：PrintServiceImpl
         */
        for (PrintService printService : serviceLoader) {
            // 此处会输出：hello world
            printService.printInfo();
        }
    }
}
