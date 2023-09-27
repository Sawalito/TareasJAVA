package BibliotecaVirtual;

public class Usuario {
	private int codAcc;
	private static int folio=0;
	private int clave;
	private String nombre;
	private int anioNac;
	private String nivelEsc;
	private String correo;
	
	public Usuario(String nombre, int anioNac, String nivelEsc, String correo) {
		super();
		this.clave=folio++;
		this.nombre = nombre;
		this.anioNac = anioNac;
		this.nivelEsc = nivelEsc;
		this.correo = correo;
	}
	
	public int asignaCodigoAcceso(int dia, int mes) {
		codAcc = anioNac*360 + (mes-1)*30 + dia;
		
		for(int i=2;i<=anioNac;i++) {
			if(anioNac%i==0)
				codAcc+=i;
		}
		
		if(nivelEsc=="basica")
			codAcc+=10;
		else
			if(nivelEsc=="media")
				codAcc+=20;
			else
				codAcc+=30;
		return codAcc;
	}
	
	public boolean equals(Usuario usuario) {
		if(clave==usuario.getClave())
			return true;
		else
			return false;
	}
	
	public int CompareTo(Usuario usuario) {
		if(clave == usuario.getClave())
			return 0;
		else
			if(clave<usuario.getClave())
				return -1;
			else
				return 1;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La clave es: "+ this.clave + "\n");
		sb.append("El nombre es: "+ nombre + "\n");
		sb.append("El correo es: "+ correo + "\n");
		sb.append("El nivel de escolaridad es: "+ nivelEsc+ "\n");
		sb.append("El codigo de Acceso es: "+ codAcc + "\n");
		sb.append("El anio de nacimiento es: "+anioNac + "\n");
		return sb.toString();
	}

	public int getCodAcc() {
		return codAcc;
	}

	public int getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAnioNac() {
		return anioNac;
	}

	public String getNivelEsc() {
		return nivelEsc;
	}

	public String getCorreo() {
		return correo;
	}
	
	
	
	
	
	
}
