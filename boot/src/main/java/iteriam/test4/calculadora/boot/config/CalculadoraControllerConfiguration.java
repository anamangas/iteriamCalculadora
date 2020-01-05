package iteriam.test4.calculadora.boot.config;

import iteriam.test4.calculadora.controller.CalculadoraController;
import iteriam.test4.calculadora.service.CalculadoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import( CalculadoraServiceConfiguration.class)
public class CalculadoraControllerConfiguration {

    @Bean
    public CalculadoraController calculadoraController(final CalculadoraService saleService) {
        return new CalculadoraController(saleService);
    }
}

