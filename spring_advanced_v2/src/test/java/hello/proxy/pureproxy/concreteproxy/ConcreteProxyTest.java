package hello.proxy.pureproxy.concreteproxy;

import hello.proxy.pureproxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureproxy.concreteproxy.code.ConcreteLogic;
import hello.proxy.pureproxy.concreteproxy.code.TimeProxy;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient concreteClient = new ConcreteClient(concreteLogic);
        concreteClient.execute();
    }

    /**
     * 대체 가능해야 하기 때문에, ConcreteLogic(실제 객체)를 상속받아서 프록시객체를 구현하고,
     * 기존 실재 객체의 메소드를 실행해야 하기 때문에, 생성자 주입으로 의존성 주입을 해줘야 한다.
     * 또한, 클라이언트가 주입하고 있는 ConcreteLogic 클래스는 다형성에 의해서
     * 상속받은 하위 클래스인 프록시 객체의 사용이 가능하기 때문에 이렇게 구현할 수 있다.
     * 조립을 통해 프록시를 사용하게 됨!
     */
    @Test
    void timeProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(concreteLogic);
        ConcreteClient concreteClient = new ConcreteClient(timeProxy);
        concreteClient.execute();
    }
}
