package vista;

public class Vista {

	public void vista(double total, double angulo) {
		// Se realiza la conversi�n de grados a radianes
		double x = Math.toRadians(angulo);
		// Se imprime el resultado con la funci�n Math.sin de java
		System.out.println("Valor de sen(" + angulo + ") con funci�n Math.sin :" + java.lang.Math.sin(x));
		// Se imprime el resultado con la funci�n Math.sin de java
		System.out.println("Valor de sen(" + angulo + ") con series de Taylor: " + total);

	}
}
