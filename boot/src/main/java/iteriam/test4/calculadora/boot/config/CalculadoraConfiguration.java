package iteriam.test4.calculadora.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CalculadoraControllerConfiguration.class,CalculadoraSwaggerConfiguration.class })
public class CalculadoraConfiguration {

}

