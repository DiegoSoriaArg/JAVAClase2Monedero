package monedero;

public class Monedero {
	
	private double dinero;
	
	public Monedero(double dineroInicial) {
		dinero = dineroInicial;
	}
	
	public void ingresarDinero(double dineroAingresar) {
		dinero += dineroAingresar;
	}
	
	public double sacarDinero(double dineroAsacar) {
		if(dinero >= dineroAsacar) {
			dinero-= dineroAsacar;
			return dineroAsacar;
		} else
			return 0;
	}
	
	double verCuantoDineroQueda() {
		return dinero;
	}

	public static void main(String[] args) {
		Monedero miMonederoRosa = new Monedero(1000);
		double disponible = miMonederoRosa.verCuantoDineroQueda();
		System.out.println(disponible);
		miMonederoRosa.sacarDinero(500);
		disponible = miMonederoRosa.verCuantoDineroQueda();
		System.out.println(disponible);
		miMonederoRosa.ingresarDinero(800);
		disponible = miMonederoRosa.verCuantoDineroQueda();
		System.out.println(disponible);
	}

}
