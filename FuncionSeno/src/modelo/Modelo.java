package modelo;

public class Modelo {
	// M�todo que realiza la serie de Taylor

	public static double serieTaylor(double angulo) {
		/*
		 * Se crean las variables para realizar el c�lculo por series Taylor
		 */
		double sumando, sumatoria = 0, precision = 0.0001d;
		// Se realiza la conversi�n de grados a radianes
		double x = Math.toRadians(angulo);

		int n = 0;
		/*
		 * Se hace el c�lculo con la serie Taylor, haciendo un llamado a otro m�todo
		 * para realizar el c�lculo de factorial
		 */
		do {
			// factorial(2 * n + 1) hace un llamado a la funci�n factorial
			sumando = Math.pow(-1, n) / factorial(2 * n + 1) * Math.pow(x, 2 * n + 1);
			sumatoria = sumatoria + sumando;
			n = n + 1;
			/*
			 * La funci�n Math.abs(sumando) > precision se usa para controlar la cantidad de
			 * iteraciones
			 */
		} while (Math.abs(sumando) > precision);

		return sumatoria;
	}

	/* M�todo que calcula factorial para la serie Taylor */
	static double factorial(int numero) {
		double factorial = 1.0d;

		while (numero != 0) {
			factorial *= numero--;
		}

		return factorial;

	}
}
