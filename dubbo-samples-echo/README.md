## 回声测试
* 回声测试用于检测服务是否可用，回声测试按照正常请求流程执行，能够测试整个调用是否通畅，可用于监控。
* 所有服务自动实现 EchoService 接口，只需将任意服务引用强制转型为 EchoService，即可使用。

##### 2.2 基于XML配置实现

dubbo-samples-echo-server

dubbo-samples-echo-client

##### 2.3 基于注解实现

dubbo-samples-echo-annotation-server

dubbo-samples-echo-annotation-client

##### 2.4 基于API实现

dubbo-samples-echo-java-server

dubbo-samples-echo-java-client