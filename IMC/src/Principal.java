
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente ataliba = new Paciente(2.0, 55.0);
		Paciente astaoufo = new Paciente(1.8, 80.0);
		Paciente jerusa = new Paciente(1.85, 75.0);
		
		System.out.println("IMc do Ataliba: " + ataliba.calcularImc());
		System.out.println("IMc do Astoufo: " + astaoufo.calcularImc());
		System.out.println("IMc do Jerusa: " + jerusa.calcularImc());
		
		System.out.println("O diagnostirco do Ataliba " + ataliba.diagnostico());
		System.out.println("O diagnostirco do Astaoufo " + astaoufo.diagnostico());
		System.out.println("O diagnostirco do Jerusa " + jerusa.diagnostico());
	}

}
