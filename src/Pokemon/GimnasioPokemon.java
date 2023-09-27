package Pokemon;
import java.util.*;

public class GimnasioPokemon {
	public static void main(String[] args) {
		Pokemon pokemon1 = new Pokemon("Charmander",'F',"Lagartija",3,5,6);
		Pokemon pokemon2 = new Pokemon("Bulbasaour",'H',"Semilla",5,6,7);
		Scanner scan = new Scanner(System.in);
		
		System.out.println(pokemon1.toString());
		System.out.println(pokemon2.toString());
		
		System.out.println(pokemon1.getValorDeAtaque());
		System.out.println(pokemon2.getValorDeDefensa());
		
		int win = pokemon1.ataca(pokemon2);
		
		if(win==1) {
			System.out.println("El pokemon 1 gana");
		}else {
			if(win==0) {
				System.out.println("El pokemon 1 empata");
			}
			else {
				System.out.println("El pokemon 1 pierde");
			}
		}
		
		pokemon2.setNumAtaques(8);
		System.out.println("La especie del pokemon 2 es "+pokemon2.getEspecie());
		
		if(pokemon1.equals(pokemon2)) {
			System.out.println("Ambos pokemones son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		//Nuevo Pokemon
		String nom,especie;
		char tipo;
		int valA,valD,numA;
		System.out.println("Introduza el nombre de su pokemon");
		nom = scan.next();
		System.out.println("Introduzca el tipo de su pokemon");
		tipo = scan.next().charAt(0);
		System.out.println("Introduzca la especie");
		especie = scan.next();
		System.out.println("Introduzca el valor de ataque");
		valA = scan.nextInt();
		System.out.println("Introduzca el valor de defensa");
		valD = scan.nextInt();
		System.out.println("Introduzca el numero de ataques");
		numA = scan.nextInt();
		Pokemon pokemon3 = new Pokemon(nom,tipo,especie,valA,valD,numA);
		
		System.out.println("Contra que pokemon quiere pelear? el 1 o 2?");
		int n;
		n=scan.nextInt();
		if(n==1) {
			win = pokemon3.ataca(pokemon1);
		}else {
			win = pokemon3.ataca(pokemon2);
		}
		
		if(win==1) {
			System.out.println("El pokemon 3 gana");
		}else {
			if(win==0) {
				System.out.println("El pokemon 3 empata");
			}
			else {
				System.out.println("El pokemon 3 pierde");
			}
		}
		
		
	}
}
