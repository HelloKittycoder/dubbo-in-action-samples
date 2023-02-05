package com.kittycoder.dubbo.samples.echo.refer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kittycoder.dubbo.samples.echo.api.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author shucheng
 * @date 2023/2/2 22:45
 */
@Component
public class EchoConsumer {

    @Reference
    private EchoService echoService;

    public String echo(String name) {
        return echoService.echo(name);
    }
}
