package iteriam.test4.calculadora.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import iteriam.test4.calculadora.dto.EntradaDTO;
import iteriam.test4.calculadora.dto.Operacion;
import iteriam.test4.calculadora.dto.ResultadoDTO;
import iteriam.test4.calculadora.service.CalculadoraService;
import iteriam.test4.calculadora.service.CalculadoraServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest(classes=CalculadoraService.class)
public class CalculadoraServiceTest {

    CalculadoraService service = new CalculadoraServiceImpl();

    @DisplayName("Test Suma")
    @Test
    public void testSuma(){
        EntradaDTO entrada = new EntradaDTO();
        entrada.setNumero1(new BigDecimal(10));
        entrada.setNumero2(new BigDecimal(5));
        ResultadoDTO resultado = service.operacionBasica(Operacion.SUMA,entrada);
        assertEquals(Boolean.TRUE, new BigDecimal(15).intValue() == resultado.getResultado().intValue());

    }

    @Test
    public void testResta(){
        EntradaDTO entrada = new EntradaDTO(new BigDecimal(10), new BigDecimal(5));
        ResultadoDTO resultado = service.operacionBasica(Operacion.RESTA,entrada);
        assertEquals(Boolean.TRUE, new BigDecimal(5).intValue() == resultado.getResultado().intValue());

    }
}
