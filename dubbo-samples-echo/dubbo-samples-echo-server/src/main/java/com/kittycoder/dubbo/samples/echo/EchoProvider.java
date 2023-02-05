package com.kittycoder.dubbo.samples.echo;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author shucheng
 * @date 2023/2/2 12:28
 */
public class EchoProvider {

    public static void main(String[] args) throws IOException {
        // #1 指定服务暴露配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/echo-provider.xml"});
        // #2 启动spring容器并暴露服务
        context.start();

        // 可以用read阻塞当前线程，也可以用dubbo提供的Main来保持Provider启动
        System.in.read();
        // Main.main(args);
    }
}
