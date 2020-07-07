package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Color;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Qual a quantidade de Formas:");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Dados da Forma #"+i+ ": " );
			System.out.print("Retangulo ou Círculo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, largura, altura));
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			}
			
		}
		
		System.out.println();
		System.out.println("AREA");
		for(Forma f : list) {
			System.out.println(String.format("%.2f", f.area()));
		}
		
		sc.close();
	}

}
