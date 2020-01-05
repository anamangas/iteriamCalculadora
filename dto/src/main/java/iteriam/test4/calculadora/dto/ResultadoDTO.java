package iteriam.test4.calculadora.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ResultadoDTO {



    @ApiModelProperty(value = "Resultado", required = true, example = "1", position = 1)
    BigDecimal resultado;

    public ResultadoDTO(Operacion operacion, EntradaDTO entrada) {
        resultado = new BigDecimal(0);
        switch (operacion) {
            case SUMA: {
                resultado = resultado.add(entrada.getNumero1());
                resultado = resultado.add(entrada.getNumero2());
            }
            break;
            case RESTA: {
                resultado = resultado.add(entrada.getNumero1());
                resultado = resultado.subtract(entrada.getNumero2());
            }
            break;
            default: {
            }
            ;
        }
    }

    public ResultadoDTO() {
        resultado = new BigDecimal(0);
    }

    public ResultadoDTO(BigDecimal value){
        resultado = value;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "ResultadoDTO [resultado=" + getResultado() + "]";
    }
}
