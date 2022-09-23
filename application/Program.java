package application;

//Importações
import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Criando as variáveis na area Stack da memória Serão referencias para as
		 * memorias instanciadas logo abaixo
		 */
		Triangle x, y;

		/*
		 * Instanciando as variáveis x e y do tipo Triangle na memória Heap(dinâmico)
		 * durante a execução. x e y apontarão para esta região
		 */
		x = new Triangle();
		y = new Triangle();

		System.out.println("Triangle measures\n");
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Tringle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		System.out.println("Larger area: Y");
		
		sc.close();
	}

}

