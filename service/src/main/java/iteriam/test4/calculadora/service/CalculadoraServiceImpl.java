package iteriam.test4.calculadora.service;

import io.corp.calculator.TracerImpl;
import iteriam.test4.calculadora.dto.EntradaDTO;
import iteriam.test4.calculadora.dto.Operacion;
import iteriam.test4.calculadora.dto.ResultadoDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

	TracerImpl trazador = new TracerImpl();

	@Override
	public ResultadoDTO operacionBasica(Operacion operacion, EntradaDTO entrada) {
		ResultadoDTO result = new ResultadoDTO(operacion, entrada);

		trazador.trace(operacion);
		trazador.trace(entrada);
		trazador.trace(result);

		return result;
	}


}
