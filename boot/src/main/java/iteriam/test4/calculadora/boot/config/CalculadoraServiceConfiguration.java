package iteriam.test4.calculadora.boot.config;

import iteriam.test4.calculadora.service.CalculadoraService;
import iteriam.test4.calculadora.service.CalculadoraServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CalculadoraServiceConfiguration {

    @Bean
    public CalculadoraService calculadoraService() {
        return new CalculadoraServiceImpl();
    }


}

