SpringCloud全家桶（含SpringCloudAlibaba）

项目介绍：
    cloud-api-commons为公共子项目，封装实体和工具等。
    --以下是注册中心、resttemplate远程调用、模仿ribbion负载均衡--
    cloud-eureka-server7001、cloud-eureka-server7002为集群式注册中心，相互注册和依赖。
    cloud-consumer-order80调用者服务，没有实际业务，只是转发请求，里面用自写的轮询方法（模仿ribbon负载均衡）
    cloud-provider-payment8001、cloud-provider-payment8002为具体的服务端
    --以下是openfeign远程调用--
    cloud-consumer-feign-order80是利用openfeign远程调用案例，包含远程调用日志
    --以下是hystrix熔断、降级监控--
    cloud-consumer-feign-hystrix-order80服务为熔断和降级转发层，里面用降级的三种写法（每个方法对应一个降级方法、全局降级方法、接口实现降级方法）
    cloud-provider-hystrix-payment8001服务为具体业务层，里面有降级（一般降级会写在client客服端调用方）和熔断方法
    cloud-consumer-hystrix-dashboard9001服务为监控窗口。
    --以下是网关--
    cloud-gateway-gateway9527服务是网关，里面有动态路由、断言、权限验证、路由日志
    --以下是config配置中心--
    cloud-config-center-3344配置中心服务端，可以实现git、本地项目读取配置文件。（cloud-provider-payment8001读取本地、cloud-config-client-3355读取git）
    cloud-config-client-3355使用配置中心服务
    
    
    