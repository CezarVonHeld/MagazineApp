import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		int escolha = 1;
		
		while(escolha != 4)
		{
			System.out.println("1 - adicionar produto");
			System.out.println("2 - Adicionar produto usado");
			System.out.println("3 - Adicionar produto importado");
			System.out.println("4 - Listar todos os produtos");
			System.out.println("5 - Sair do programa");
			System.out.print("Digite sua opção: ");
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch(escolha)
			{
				case 1:
					System.out.print("Entre com o nome do produto: ");
					String name = sc.nextLine();
					System.out.print("Entre com o valor do produto: ");
					double valueP = sc.nextDouble();
					list.add(new Product(name, valueP));
					break;
				case 2:
					System.out.print("Entre com o nome do produto usado: ");
					name = sc.nextLine();
					System.out.print("Entre com o valor do produto usado: ");
					valueP = sc.nextDouble();
					System.out.print("Entre a data de fabricação: ");
					Date dateM = sdf.parse(sc.next());
					list.add(new UsedProduct(name, valueP, dateM));
					break;
				case 3:
					System.out.print("Entre com o nome do produto importado: ");
					name = sc.nextLine();
					System.out.print("Entre com o valor do produto importado: ");
					valueP = sc.nextDouble();
					System.out.print("Entre com as taxas de importação: ");
					Double fees = sc.nextDouble();
					list.add(new ImportedProduct(name, valueP, fees));
					break;
				case 4:
					System.out.println();
					System.out.println("PAYMENTS:");
					for(Product prod : list)
					{
						System.out.println(prod);
					}
					break;
			}	
		}
		sc.close();
	}
}
		
		
	


