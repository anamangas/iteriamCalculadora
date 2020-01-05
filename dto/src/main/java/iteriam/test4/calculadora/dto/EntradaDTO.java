package iteriam.test4.calculadora.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class EntradaDTO {

	@ApiModelProperty(value = "Numero 1", required = true, example = "10", position = 1)
	BigDecimal numero1;
	@ApiModelProperty(value = "Numero 2", required = true, example = "5", position = 2)
	BigDecimal numero2;

	public EntradaDTO(BigDecimal numero1, BigDecimal numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public EntradaDTO() {
	}

	public BigDecimal getNumero1() {
		return numero1;
	}

	public void setNumero1(BigDecimal numero1) {
		this.numero1 = numero1;
	}

	public BigDecimal getNumero2() {
		return numero2;
	}

	public void setNumero2(BigDecimal numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		return "EntradaDTO [numero1=" + getNumero1() + ", numero2=" + getNumero2() + "]";
	}

}
