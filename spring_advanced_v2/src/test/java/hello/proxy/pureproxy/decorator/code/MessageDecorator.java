package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Component{
    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");
        String componentResult = component.operation();
        String decorateResult = "This Message is " + componentResult + ".^^";
        log.info("꾸미기 전 -> {}, 꾸미기 후 -> {}",componentResult, decorateResult);
        return decorateResult;
    }
}
