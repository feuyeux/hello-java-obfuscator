package org.feuyeux.obfuscator;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class HelloService {
    @PostConstruct
    public void init() {
        System.out.println("HelloService init");
        AtomicInteger n = new AtomicInteger(3);
        //Thread.ofVirtual().start(() -> {
        while (n.get() > 0) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("virtual thread running " + n.getAndDecrement());
            } catch (InterruptedException ignored) {
            }
        }
    }
}
