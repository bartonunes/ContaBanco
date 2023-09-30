
public class Paciente {

	double altura;
	double peso;
	double imc;
	public Paciente(double altura, double peso) {
	
		this.altura = altura;
		this.peso = peso;
	}

	public double calcularImc() {
		
		return imc=(peso)/(altura*altura);
	}
	
	public String diagnostico() {
		
			if(calcularImc() < 16) {
				return "Baixo peso muito grave";					
			}
			
			if(calcularImc()> 16 && calcularImc() <16.99 ) {
				return "Baixo peso grave";					
			}
			
			if(calcularImc() > 17 && calcularImc() <18.49) {
				return "Baixo peso";					
			}
			
			if(calcularImc()> 18.5 && calcularImc() <24.99) {
				return "Peso normal";					
			}
			
			if(calcularImc() > 25 && calcularImc() <29.99) {
				return "Sobrepeso";					
			}
			
			if(calcularImc()>30 && calcularImc() <34.99) {
				return "Obesidade grau I";					
			}
			
			if(calcularImc()> 35 && calcularImc() <39.99) {
				return "Obesidade grau II	";					
			}
			
			if(calcularImc() >=40) {
				return "Obesidade grau III (Obesidade Morbida)";					
			}
			
		return "";
	}
	
	
}
