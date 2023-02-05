package com.kittycoder.dubbo.samples.echo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.kittycoder.dubbo.samples.echo.api.EchoService;
import com.kittycoder.dubbo.samples.echo.api.impl.EchoServiceImpl;

import java.io.IOException;

/**
 * @author shucheng
 * @date 2023/2/5 9:06
 */
public class JavaApiProvider {

    public static void main(String[] args) throws IOException {
        ServiceConfig<EchoService> service = new ServiceConfig<>();
        // 1.设置服务方应用名称
        service.setApplication(new ApplicationConfig("java-echo-provider"));
        // 2.创建注册中心，并指定ZooKeeper协议、IP和端口
        service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        // 3.指定服务暴露的接口
        service.setInterface(EchoService.class);
        // 4.指定真实服务对象
        service.setRef(new EchoServiceImpl());
        // 5.暴露服务
        service.export();
        System.out.println("java-echo-provider is running.");
        System.in.read();
    }
}
