package iteriam.test4.calculadora.boot;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.reflect.WildcardType;

@SpringBootApplication
public class CalculadoraApp {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraApp.class, args);
    }

//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("iteriam.test4.calculadora.controller"))
//                .paths(PathSelectors.regex("/calculadora/.*")).build().pathMapping("/")
//                .genericModelSubstitutes(ResponseEntity.class)
//                .alternateTypeRules(AlternateTypeRules.newRule(
//                        typeResolver.resolve(DeferredResult.class,
//                                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
//                        typeResolver.resolve(WildcardType.class)))
//                .useDefaultResponseMessages(false).apiInfo(apiInfo());
//    }
//
//    @SuppressWarnings("deprecation")
//    private ApiInfo apiInfo() {
//
//        return new ApiInfo("API Prueba Iteriam-Sanitas",
//                "API de prueba para proceso de seleccion de Sanitas con Iteriam", appVersion, "http://localhost:9080/swagger-ui.html", "", "", "");
//    }
}
