package ex3;

public class COFINS implements Imposto {

	@Override
	public double calculaImposto(double valor) {
		if (valor > 17000) {
			return valor * 0.08;
		} else {
		return 0;
		}
	}
}
