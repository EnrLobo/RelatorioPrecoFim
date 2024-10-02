import java.util.Scanner;

public class Impostos {
	
	Scanner scan = new Scanner(System.in);

	public double IPI(double valorProduto, double frete, double seguro) {
		 double baseCalculo = valorProduto + frete + seguro;
		 double ipi = baseCalculo*15;
		 return ipi;
	}
	
	public double ICMS(double valor) {
		double aliMGSP = 0.1;
		double aliSPMG = 0.9;
		double aliRJMG = 0.5;
		double aliRJSP = 0.8;
		double aliSPRJ = 0.5;
		double aliMGRJ = 0.7;
		double icms =0;
		
		System.out.println("SELECIONE O ESTADO DE ORIGEM DESEJADO"
						+ "\n1 - Minas Gerias"
						+ "\n2 - São Paulo"
						+ "\n3 - Rio de Janeiro");
		int estOrigin = scan.nextInt();
		scan.nextLine();
		
		System.out.println("SELECIONE O ESTADO DE DESTINO DESEJADO"
				+ "\n1 - Minas Gerias"
				+ "\n2 - São Paulo"
				+ "\n3 - Rio de Janeiro");
		int estDest = scan.nextInt();
		scan.nextLine();
		
		switch (estOrigin) {
		case 1:
			System.out.println("O estado de origem selecionado foi Minas Gerais.");
			if(estDest == 1) {
				System.out.println("Isento");
				icms = 0;
			}
			else if(estDest == 2) {
				System.out.println("O estado de destino escolhido foi São Paulo.");
				icms = valor*aliMGSP;
			}
			else {
				System.out.println("O estado de destino escolhido foi o Rio de Janeiro.");
				icms = valor*aliMGRJ;
			}
			break;
		case 2:
			System.out.println("O estado de origem selecionado foi São Paulo.");
			if(estDest == 1) {
				System.out.println("O estado de destino escolhido foi Minas Gerais.");
				icms = valor*aliSPMG;
			}
			else if(estDest == 2) {
				System.out.println("Isento");
				icms = 0;
			}
			else {
				System.out.println("O estado de destino escolhido foi o Rio de Janeiro.");
				icms = valor*aliSPRJ;
			}
			break;
		case 3:
			System.out.println("O estado de origem selecionado foi Rio de Janeiro.");
			if(estDest == 1) {
				System.out.println("O estado de destino escolhido foi Minas Gerais.");
				icms = valor*aliRJMG;
			}
			else if(estDest == 2) {
				System.out.println("O estado de destino escolhido foi São Paulo.");
				icms = valor*aliRJSP;
			}
			else {
				System.out.println("Isento");
				icms = 0;
			}
			break;
			
		default:
			break;
		}
		return icms;
		}
	
	public double ISS(double valorServico, double aliPraticada) {
		double iss = aliPraticada*valorServico;
		return iss;
		}
	
}
