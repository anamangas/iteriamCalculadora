package iteriam.test4.calculadora.controller.test;

import iteriam.test4.calculadora.controller.CalculadoraController;
import iteriam.test4.calculadora.dto.EntradaDTO;
import iteriam.test4.calculadora.dto.Operacion;
import iteriam.test4.calculadora.dto.ResultadoDTO;
import iteriam.test4.calculadora.service.CalculadoraService;
import iteriam.test4.calculadora.service.CalculadoraServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes= CalculadoraController.class)
@ExtendWith( MockitoExtension.class )
public class CalculadoraControllerTest {

    @InjectMocks
    private CalculadoraController controller;
    @Mock
    private CalculadoraServiceImpl calculadoraService;
    private MockMvc mockMvc;
    private EntradaDTO entrada;
    private ResultadoDTO resultadoSuma;
    private ResultadoDTO resultadoResta;

    @BeforeEach
    public void setUp() {
        calculadoraService = Mockito.mock(CalculadoraServiceImpl.class);
        controller = new CalculadoraController(calculadoraService);
        entrada = new EntradaDTO(new BigDecimal(10), new BigDecimal(5));
        resultadoResta = new ResultadoDTO(new BigDecimal(5));
        resultadoSuma = new ResultadoDTO(new BigDecimal(15));
        this.mockMvc = MockMvcBuilders
                .standaloneSetup( controller )
                .setMessageConverters( new GsonHttpMessageConverter() )
                .build();

    }

    @Test
    public void testSuma() {
        Mockito.when(calculadoraService.operacionBasica(Operacion.SUMA, entrada)).thenReturn(resultadoSuma);
        assertEquals(controller.suma(entrada).getBody().getResultado().intValue(), new BigDecimal(15).intValue());
    }

    @Test
    public void testResta() {
        Mockito.when(calculadoraService.operacionBasica(Operacion.RESTA, entrada)).thenReturn(resultadoResta);
        assertEquals(controller.resta(entrada).getBody().getResultado().intValue(), new BigDecimal(5).intValue());
    }
}


