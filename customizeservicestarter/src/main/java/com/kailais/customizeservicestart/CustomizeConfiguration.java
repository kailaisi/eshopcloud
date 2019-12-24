package com.kailais.customizeservicestart;

import com.kailaisi.addserver.AddServiceImpl;
import com.kailaisi.customizeapi.AddService;
import com.kailaisi.customizeapi.MinusService;
import com.kailaisi.minusserver.MinusServiceNotSupportNegativeImpl;
import com.kailaisi.minusserver.MinusServiceSupportNegativeImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：
 * <p/>作者：wu
 * <br/>创建时间：2019/12/24 23:30
 */
@Configuration
public class CustomizeConfiguration {
    @Bean
    public AddService getAddService() {
        System.out.println("create addservice");
        return new AddServiceImpl();
    }

    @Bean
    @ConditionalOnMissingBean(MinusService.class)
    public MinusService getMinusServiceNotSupportNegative() {
        System.out.println("create MinusServiceNotSupportNegative");
        return new MinusServiceNotSupportNegativeImpl();
    }

    @Bean
    @ConditionalOnProperty(prefix = "com.kailaisi", name = "supportnegative", havingValue = "true")
    public MinusService getMinusServiceSupportNegative() {
        System.out.println("create MinusServiceSupportNegative");
        return new MinusServiceSupportNegativeImpl();
    }
}
