package vista;

public class Vista {

	public void vista(double total, double angulo) {
		// Se realiza la conversión de grados a radianes
		double x = Math.toRadians(angulo);
		// Se imprime el resultado con la función Math.sin de java
		System.out.println("Valor de sen(" + angulo + ") con función Math.sin :" + java.lang.Math.sin(x));
		// Se imprime el resultado con la función Math.sin de java
		System.out.println("Valor de sen(" + angulo + ") con series de Taylor: " + total);

	}
}
