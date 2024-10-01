import java.util.Scanner;

public class Impostos {
	
	Scanner scan = new Scanner(System.in);

	public double IPI(double valorProduto, double frete, double seguro) {
		 double baseCalculo = valorProduto + frete + seguro;
		 double ipi = baseCalculo*15;
		 return ipi;
	}
	
	public void ICMS(double valor) {
		double aliMGSP = 0.1;
		double aliSPMG = 0.9;
		double aliRJMG = 0.5;
		double aliRJSP = 0.8;
		double aliSPRJ = 0.5;
		double aliMGRJ = 0.7;
		double icms;
		
		System.out.println("SELECIONE O ESTADO DE ORIGEM DESEJADO/n"
						+ "1 - Minas Gerias"
						+ "2 - São Paulo"
						+ "3 - Rio de Janeiro");
		int estOrigin = scan.nextInt();
		scan.nextLine();
		
		System.out.println("SELECIONE O ESTADO DE DESTINO DESEJADO/n"
				+ "1 - Minas Gerias"
				+ "2 - São Paulo"
				+ "3 - Rio de Janeiro");
		int estDest = scan.nextInt();
		scan.nextLine();
		
		switch (estOrigin) {
		case 1:
			System.out.println("O estado de origem selecionado foi Minas Gerais.");
			if(estDest == 1) {
				System.out.println("Isento");
			}
			else if(estDest == 2) {
				System.out.println("O estado de destino escolhido foi São Paulo.");
				double aliFim = aliMGSP;
			}
			else {
				System.out.println("O estado de destino escolhido foi o Rio de Janeiro.");
				double aliFim = aliMGRJ;
			}
			break;
		case 2:
			System.out.println("O estado de origem selecionado foi São Paulo.");
			
			break;
		case 3:
			System.out.println("O estado de origem selecionado foi Rio de Janeiro.");
			
			break;
			
		default:
			break;
		}
		}
	
	public double ISS(double valorServico, double aliPraticada) {
		double iss = aliPraticada*valorServico;
		return iss;
		}
	
}
