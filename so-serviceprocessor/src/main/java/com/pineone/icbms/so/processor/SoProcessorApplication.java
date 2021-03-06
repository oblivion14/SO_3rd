package com.pineone.icbms.so.processor;

//import com.pineone.icbms.so.web.spring.CustomBeanNameGenerator;

import com.pineone.icbms.so.processor.route.ProcessorRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "com.pineone.icbms.so")
@EntityScan(basePackages = "com.pineone.icbms.so")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.pineone.icbms.so")
//@PropertySource("conf/processor.properties")
public class SoProcessorApplication implements CommandLineRunner {
    /**
     * log
     */
    private Logger log = LoggerFactory.getLogger(getClass());

    /**
     * run application.<BR/>
     * @param args arguments
     */
    public static void main(String[] args) {
//		SpringApplication.run(SoProcessorApplication.class, args);
        SpringApplication app = new SpringApplication(SoProcessorApplication.class);
        app.run(args);
//        CustomBeanNameGenerator beanNameGenerator = new CustomBeanNameGenerator();
//        new SpringApplicationBuilder(SoProcessorApplication.class)
//                .beanNameGenerator(beanNameGenerator)
//                .run(args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        log.debug("args: {}", Arrays.stream(args).toArray());
        ProcessorRouter.getInstance().run(args);
    }
}
