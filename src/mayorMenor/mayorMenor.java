package mayorMenor;

public class mayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 3, 19, 21, 63, 2, 19, 38, 99, 4, 28 };
		int i;
		int menor = 0;
		int mayor = 0;
		int tmpMayor;
		int tmpMenor;

		for (i = 0; i < numeros.length; i++) {
			tmpMayor = numeros[i];
			tmpMenor = numeros[i];

			if (i == 0) {
				mayor = tmpMayor;
				menor = tmpMenor;
			} else {
				if (tmpMayor >= mayor) {
					mayor = tmpMayor;
				}
				if (tmpMenor <= menor) {
					menor = tmpMenor;
				}
			}
		}
		System.out.println("El número mayor es: " + mayor + " y el menor es: " + menor);
	}

}
