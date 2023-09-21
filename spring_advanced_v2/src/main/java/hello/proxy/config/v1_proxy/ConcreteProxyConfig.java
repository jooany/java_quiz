package hello.proxy.config.v1_proxy;

import hello.proxy.app.v2.OrderControllerV2;
import hello.proxy.app.v2.OrderRepositoryV2;
import hello.proxy.app.v2.OrderServiceV2;
import hello.proxy.config.v1_proxy.concrete_proxy.OrderControllerConcreteProxy;
import hello.proxy.config.v1_proxy.concrete_proxy.OrderRepositoryConcreteProxy;
import hello.proxy.config.v1_proxy.concrete_proxy.OrderServiceConcreteProxy;
import hello.proxy.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConcreteProxyConfig {

    @Bean
    public OrderControllerV2 orderController(LogTrace logTrace){
        return new OrderControllerConcreteProxy(new OrderControllerV2(orderService(logTrace)), logTrace);
    }

    @Bean
    public OrderServiceV2 orderService(LogTrace logTrace){
        return new OrderServiceConcreteProxy(new OrderServiceV2(orderRepository(logTrace)), logTrace);
    }

    @Bean
    public OrderRepositoryV2 orderRepository(LogTrace logTrace){
        return new OrderRepositoryConcreteProxy(new OrderRepositoryV2(), logTrace);
    }
}
