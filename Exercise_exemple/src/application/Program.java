package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = scan.nextLine();
		System.out.println("Retirda (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(scan.nextLine(), formatter);
		
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), formatter);
		
		
		scan.close();
	}
}
