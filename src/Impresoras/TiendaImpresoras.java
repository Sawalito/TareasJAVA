package Impresoras;

public class TiendaImpresoras {
	public static void main(String[] args) {
		Impresora im1 = new Impresora('L',2);
		Impresora im2 = new Impresora('I',6,'N');
		Impresora im3 = new Impresora('M',10);
		Impresora im4 = new Impresora('I',8,'S');
		
		System.out.println("El costo de la primera impresora es: "+im1.VenderImpresora());
		System.out.println("El costo de la segunda impresora es: "+im2.VenderImpresora());
		
		System.out.println("Se le debe dar mantenimiento a la impresora 3? "+ im3.Mantenimiento(10));
		System.out.println("La velocidad de impresion de la tercera impresora es: "+im3.getVelocidad());
		
		System.out.println(im4.toString());
	}
}
