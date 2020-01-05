package iteriam.test4.calculadora.service;


import iteriam.test4.calculadora.dto.EntradaDTO;
import iteriam.test4.calculadora.dto.Operacion;
import iteriam.test4.calculadora.dto.ResultadoDTO;

public interface CalculadoraService {

	public ResultadoDTO operacionBasica(Operacion operacion, EntradaDTO entrada);

}
