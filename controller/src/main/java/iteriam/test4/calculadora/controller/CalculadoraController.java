package iteriam.test4.calculadora.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import iteriam.test4.calculadora.dto.EntradaDTO;
import iteriam.test4.calculadora.dto.Operacion;
import iteriam.test4.calculadora.dto.ResultadoDTO;
import iteriam.test4.calculadora.service.CalculadoraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    /**
     * Suma dos numeros encapsulados en el objeto EntradaSumaDTO compuesto por dos
     * Double que se pasa como un JSON como un String
     *
     * @return Resultado de la suma
     */
    @ApiOperation(value = "Suma aritmetica", notes = "Devuelve la suma de dos elementos aritmeticos")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = ResultadoDTO.class),
            @ApiResponse(code = 404, message = "Not Found", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = String.class)})
    @PostMapping("/suma")
    public @ResponseBody
    ResponseEntity<ResultadoDTO> suma(
            @ApiParam(value = "JSON con los numeros", required = true) @Valid @RequestBody EntradaDTO entrada) {
        ResultadoDTO resultado = calculadoraService.operacionBasica(Operacion.SUMA, entrada);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    /**
     * Resta dos numeros, el segundo al primero encapsulados en el objeto
     * EntradaSumaDTO compuesto por dos Double que se pasa como un JSON como un
     * String
     *
     * @return Resultado de la resta
     */
    @ApiOperation(value = "Resta aritmetica", notes = "Devuelve la resta de dos elementos aritmeticos, el primero menos el segundo")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = ResultadoDTO.class),
            @ApiResponse(code = 404, message = "Not Found", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = String.class)})
    @PostMapping("/resta")
    public @ResponseBody
    ResponseEntity<ResultadoDTO> resta(
            @ApiParam(value = "JSON con los numeros", required = true) @Valid @RequestBody EntradaDTO entrada) {
        ResultadoDTO resultado = calculadoraService.operacionBasica(Operacion.RESTA, entrada);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

}
