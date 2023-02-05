package com.kittycoder.dubbo.samples.echo;

import com.kittycoder.dubbo.samples.echo.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shucheng
 * @date 2023/2/2 22:11
 */
public class EchoConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/echo-consumer.xml"});
        context.start();
        EchoService echoService = (EchoService) context.getBean("echoService");
        String status = echoService.echo("Hello world!");
        System.out.println("echo result: " + status);
    }
}
