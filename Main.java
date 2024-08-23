package y;

import java.util.Scanner;
import x.Forma;
import x.Triangulo;
import x.Retangulo;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Medir área de: ");
	    System.out.println("1 - Triangulo");	
	    System.out.println("2 - Retangulo");
	    int opcao = scn.nextInt();
	    
	    switch (opcao) {
	        case 1:
	            System.out.println("Digite a base: ");
	            double base = scn.nextDouble();
	            System.out.println("Digite a altura: ");
	            double altura2 = scn.nextDouble();
	            
	            Forma triangulo = new Triangulo(base, altura2);
	            System.out.println(triangulo.mostarInfo2());
	            System.out.println("A area desse triangulo é:" + triangulo.calcularArea2());
	            break;
	        case 2:
	        	System.out.println("Digite a largura: ");
	            float largura = scn.nextFloat();
	            System.out.println("Digite a altura: ");
	            float altura = scn.nextFloat();
	            
	            Forma retangulo = new Retangulo(largura, altura);
	            System.out.println(retangulo.mostrarInfo());
	            System.out.println("A area desse retângulo é:" + retangulo.calcularArea());
	            break;
	         default:
	            System.out.println("Opção inválida, tente novamente");
	            }
	    scn.close();
		}
	}