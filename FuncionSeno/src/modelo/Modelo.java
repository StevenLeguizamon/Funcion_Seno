package modelo;

public class Modelo {
	// Método que realiza la serie de Taylor

	public static double serieTaylor(double angulo) {
		/*
		 * Se crean las variables para realizar el cálculo por series Taylor
		 */
		double sumando, sumatoria = 0, precision = 0.0001d;
		// Se realiza la conversión de grados a radianes
		double x = Math.toRadians(angulo);

		int n = 0;
		/*
		 * Se hace el cálculo con la serie Taylor, haciendo un llamado a otro método
		 * para realizar el cálculo de factorial
		 */
		do {
			// factorial(2 * n + 1) hace un llamado a la función factorial
			sumando = Math.pow(-1, n) / factorial(2 * n + 1) * Math.pow(x, 2 * n + 1);
			sumatoria = sumatoria + sumando;
			n = n + 1;
			/*
			 * La función Math.abs(sumando) > precision se usa para controlar la cantidad de
			 * iteraciones
			 */
		} while (Math.abs(sumando) > precision);

		return sumatoria;
	}

	/* Método que calcula factorial para la serie Taylor */
	static double factorial(int numero) {
		double factorial = 1.0d;

		while (numero != 0) {
			factorial *= numero--;
		}

		return factorial;

	}
}
