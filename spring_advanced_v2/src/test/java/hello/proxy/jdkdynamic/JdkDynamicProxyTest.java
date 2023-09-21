package hello.proxy.jdkdynamic;

import hello.proxy.jdkdynamic.code.AImpl;
import hello.proxy.jdkdynamic.code.Ainterface;
import hello.proxy.jdkdynamic.code.TimeInvocationHandler;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA() {
        Ainterface target = new AImpl();
        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        Ainterface proxy = (Ainterface) Proxy.newProxyInstance(Ainterface.class.getClassLoader(), new Class[]{Ainterface.class}, handler);

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }
}
