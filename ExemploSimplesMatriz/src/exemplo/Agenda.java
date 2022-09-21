package exemplo;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String agenda[][] = new String[24][31]; // 0-30

		int hora;
		int dia;
		char opcao;

		System.out.println("AGENDA");
		System.out.println("---------");
		do {
			System.out.println("Digite o dia do evento: ");
			dia = leia.nextInt() - 1; // - 1 pra evitar problema no caso de pesquisar
			System.out.println("Digite a hora do evento: ");
			hora = leia.nextInt();
			leia.nextLine(); // limpar buffer do teclado
			System.out.println("Descri��o: ");
			agenda[hora][dia] = leia.nextLine();
			System.out.print("Continuar? S/N: ");
			opcao = leia.next().toUpperCase().charAt(0);
			System.out.println(""); // quebrar linha
		} while (opcao == 'S');

		for (int d=0; d<31; d++) {
			for (int h=0; h<24; h++) {
				if (agenda[h][d] != null) {
					System.out.printf("Dia %d - %d Horas: %s\n", d+1, h, agenda[h][d]);
					System.out.println("------------------------------------------------------");
				}
			}
		}

	}

}
