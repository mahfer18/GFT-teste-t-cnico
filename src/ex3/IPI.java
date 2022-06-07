package ex3;

public class IPI implements Imposto {

	@Override
	public double calculaImposto (double valor) {
		
		if (valor < 25000) {
			
			return valor * 0.05;
		}
		else if(valor >= 25000) {
			return valor * 0.10;	
		}
		return valor;
	}
}
