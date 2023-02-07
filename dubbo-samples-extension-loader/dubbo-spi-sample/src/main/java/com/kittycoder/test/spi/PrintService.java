package com.kittycoder.test.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author shucheng
 * @date 2023/2/5 21:58
 */
// 1.SPI接口定义
@SPI("impl")
public interface PrintService {
    void printInfo();
}
