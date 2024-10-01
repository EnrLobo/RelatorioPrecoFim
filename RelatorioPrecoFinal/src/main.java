import java.util.Scanner;

public class main {

	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Impostos imp = new Impostos();
		System.out.println("DIGITE A OPÇÃO"
				+ "1 - Produto"
				+ "2 - Serviço");
		int op = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite a margem de lucro do produto/serviço: ");
		double margLucro = scan.nextDouble();
		
		switch (op) {
		case 1:
			System.out.println("Digite o custo para a produção do produto: ");
			double custoPro = scan.nextDouble();
			System.out.println("Digite o valor do frete: ");
			double frete = scan.nextDouble();
			System.out.println("Digite o valor do seguro: ");
			double seguro = scan.nextDouble();
			
			double ipi = imp.IPI(custoPro, frete, seguro);
			break;

		case 2:
			System.out.println("Digite o custo para a realização do serviço: ");
			double custoSer = scan.nextDouble();
			System.out.println("Digite o valor da alíquota praticada: ");
			double aliPraticada = scan.nextDouble();
			
			double iss = imp.ISS(custoSer, aliPraticada);
			break;
		}

	}

}
