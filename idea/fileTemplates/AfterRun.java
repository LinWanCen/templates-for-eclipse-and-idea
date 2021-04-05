#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 如果需要更复杂的参数可以使用 {@link org.springframework.boot.ApplicationRunner}
 */
@Component
public class AfterRun implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(AfterRun.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("服务器启动完毕 start complete");
    }
}