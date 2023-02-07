package com.kittycoder.test.spi;

/**
 * @author shucheng
 * @date 2023/2/5 21:58
 */
// 2.SPI接口实现类
public class PrintServiceImpl implements PrintService {
    @Override
    public void printInfo() {
        System.out.println("hello world");
    }
}
