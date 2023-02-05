package com.kittycoder.dubbo.samples.echo.api.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.kittycoder.dubbo.samples.echo.api.EchoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shucheng
 * @date 2023/2/2 12:16
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + now +"] Hello " + message
            + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return message;
    }
}
