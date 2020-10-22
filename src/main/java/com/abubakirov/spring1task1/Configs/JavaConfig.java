package com.abubakirov.spring1task1.Configs;

import com.abubakirov.spring1task1.domain.IWheel;
import com.abubakirov.spring1task1.domain.MonoWheel;
import com.abubakirov.spring1task1.domain.RoundedWheel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.abubakirov.spring1task1.domain")
public class JavaConfig {
    @Bean("monoWheel")
    public MonoWheel monoWheel(IWheel wheel, @Value("Model S")String model) {
        MonoWheel monoWheel = new MonoWheel(model);
        monoWheel.setWheel(wheel);
        return monoWheel;
    }
}
