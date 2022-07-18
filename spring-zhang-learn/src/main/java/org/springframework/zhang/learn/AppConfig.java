package org.springframework.zhang.learn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ss_zhang
 * @version 1.0
 * @description: TODO
 * @date 2022/7/6 20:37
 */
@ComponentScan(value = "org.springframework.zhang.learn")
@Configuration
@EnableTransactionManagement
public class AppConfig {
}
