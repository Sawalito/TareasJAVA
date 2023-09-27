package BibliotecaVirtual;
import java.util.*;
public class EjecutableUsuario {
	public static void main(String[] args) {
		Usuario user = new Usuario("Saul",2004,"medio","sawalin@itam.mx");
		Usuario user1 = new Usuario("Sal",2005,"medio","saalin@itam.mx");
		Scanner scan = new Scanner(System.in);
		
		int dia,mes;
		System.out.println("Primera persona:");
		System.out.println("Introduza el mes de nacimiento");
		mes = scan.nextInt();
		System.out.println("Introduza el dia de nacimiento");
		dia = scan.nextInt();
		
		System.out.println("Su codigo de acceso es: "+ user.asignaCodigoAcceso(dia, mes));
		
		
		System.out.println("Segunda persona:");
		System.out.println("Introduza el mes de nacimiento");
		mes = scan.nextInt();
		System.out.println("Introduza el dia de nacimiento");
		dia = scan.nextInt();
		System.out.println("Su codigo de acceso es: "+ user1.asignaCodigoAcceso(dia, mes));
		
		int res = user.CompareTo(user1);
		
		if(res==0) {
			System.out.println("Los objetos son iguales");
		}else {
			if(res<-1) {
				System.out.println("El objeto 1 es menor que el segundo");
			}else {
				System.out.println("El objeto 1 es mayor que el segundo");
			}
		}
		
		System.out.println(user.toString());
		System.out.println(user1.toString());
	}
}
