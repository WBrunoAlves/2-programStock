/*Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e
quantidade no estoque). Em seguida:
� Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no
estoque)
� Realizar uma entrada no estoque e mostrar novamente os dados do produto
� Realizar uma sa�da no estoque e mostrar novamente os dados do produto
Para resolver este problema, voc� deve criar
uma CLASSE conforme projeto ao ado:

*/

package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*instanciar a classe Product*/
		Product product = new Product();
		
		/*CAPTURA DOS DADOS*/
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();		
		System.out.println("Price: ");
		product.price = sc.nextDouble();		
		System.out.println("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		
		/*ENTRADA DE ADI��O quantidade de produto*/
		System.out.print("Enter the number of products to be ADDED in stock: ");
		int quantity = sc.nextInt(); // variavel para receber a quantidade
		product.addProduct(quantity);// manda o valor da variav�l para o m�todo de product.
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		
		
		/*REMO��O DE PRODUTOS - mesma coisa por�m..*/
		System.out.print("Enter the number of products to be REMOVE in stock: ");
		quantity = sc.nextInt(); //
		product.removeProduct(quantity);//chama m�todo de remo��o da classe Product
		
		System.out.println();
		System.out.println("Update data: " + product.toString());
		
		sc.close();

	}

}
