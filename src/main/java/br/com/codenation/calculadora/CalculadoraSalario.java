package br.com.codenation.calculadora;


public class CalculadoraSalario {

	double salarioaposinss;
	double salarioLiquido;
	public long calcularSalarioLiquido(double salarioBase) {
		salarioLiquido = calcularIRRF(salarioBase);
		return Math.round(salarioLiquido);
	}

	//Método para calcular o desconto de INSS
	private double calcularInss(double salarioBase) {
		if(salarioBase <= 1039){
			salarioaposinss =0;
		}
		else if(salarioBase <= 1500){
			salarioaposinss = salarioBase*0.92;
		} else if(salarioBase <= 4000){
			salarioaposinss = salarioBase*0.91;
			} else {
			salarioaposinss = salarioBase*0.89;
				}
		return salarioaposinss;
	}

	private double calcularIRRF(double salarioBAse){
		if(calcularInss(salarioBAse) <= 3000){
			salarioLiquido = salarioaposinss;
		} else if(calcularInss(salarioBAse) <= 6000){
			salarioLiquido = salarioaposinss*0.925;
		} else{
			salarioLiquido = salarioaposinss*0.85;
		}
		return salarioLiquido;
	}

}