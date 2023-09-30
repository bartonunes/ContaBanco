
public class ParametrosInvalidosException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int parametroUm;
	int parametroDois;
	public ParametrosInvalidosException(int parametroUm, int parametroDois) {
		super();
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}
	@Override
	public String toString() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
	
	
	

}
