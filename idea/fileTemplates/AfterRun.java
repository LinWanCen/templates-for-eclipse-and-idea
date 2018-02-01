package cn.itcast.springboot.webscoketchat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 如果需要更复杂的参数可以使用 ApplicationRunner
 */
@Component
public class AfterRun implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务器启动完毕！");
    }
}
