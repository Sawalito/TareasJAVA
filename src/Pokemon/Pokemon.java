package Pokemon;

public class Pokemon {
	private char tipo;
	private String nombre;
	private String especie;
	private int valorDeAtaque;
	private int valorDeDefensa;
	private int numAtaques;
	private int clave;
	private static int folio=0;;
	
	
	public Pokemon(String nombre,char tipo, String especie, int valorDeAtaque, int valorDeDefensa, int numAtaques) {
		super();
		this.clave=folio++;
		this.tipo = tipo;
		this.nombre = nombre;
		this.especie = especie;
		this.valorDeAtaque = valorDeAtaque;
		this.valorDeDefensa = valorDeDefensa;
		this.numAtaques = numAtaques;
	}
	
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getValorDeAtaque() {
		return valorDeAtaque;
	}
	public void setValorDeAtaque(int valorDeAtaque) {
		this.valorDeAtaque = valorDeAtaque;
	}
	public int getValorDeDefensa() {
		return valorDeDefensa;
	}
	public void setValorDeDefensa(int valorDeDefensa) {
		this.valorDeDefensa = valorDeDefensa;
	}
	public int getNumAtaques() {
		return numAtaques;
	}
	public void setNumAtaques(int numAtaques) {
		this.numAtaques = numAtaques;
	}
	public int getClave() {
		return clave;
	}
	
	public int ataca(Pokemon pokemon) {
		char type = pokemon.getTipo();
		int a=0,d=0;
		int atac = pokemon.getNumAtaques();
		int valDef = pokemon.getValorDeDefensa();
		
		if(tipo==type)
			a = valorDeAtaque*numAtaques;
			d = valDef*atac;
			
		if(tipo=='A' && type=='F') {
			a = valorDeAtaque*numAtaques*5;
			d = valDef*atac;
		}
			
		if(tipo=='A' && type=='H') {
			a = valorDeAtaque*numAtaques*2;
		    d = valDef*atac;
		}
		    
		if(tipo=='F' && type=='A') {
			a = valorDeAtaque*numAtaques;
			d = valDef*atac*5;
		}
			
		if(tipo=='F' && type=='H') {
			a = valorDeAtaque*numAtaques*5;
			d = valDef*atac;
		}
			
		if(tipo=='H' && type=='A') {
			a = valorDeAtaque*numAtaques;
			d = valDef*atac*2;
		}
			
		if(tipo=='H' && type=='F') {
			a = valorDeAtaque*numAtaques;
			d = valDef*atac*5;
		}
			
		if(a==d) {
			return 0;
		}else {
			if(a>d) {
				valorDeAtaque+=2;
				return 1;
			}else {
				pokemon.setValorDeAtaque(pokemon.getValorDeAtaque()+5);
				return -1;
			}
		}
			
	}
	
	public boolean equals(Pokemon pokemon) {
		if(pokemon.getClave()==clave)
			return true;
		else
			return false;
	}
	
	public int CompareTo(Pokemon pokemon) {
		int clav = pokemon.getClave();
		if(clav == clave)
			return 0;
		else
			if(clav < clave)
				return 1;
			else
				return -1;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La clave del pokemon es "+clave+"\n");
		sb.append("El nombre es "+nombre+"\n");
		sb.append("El tipo es "+tipo+"\n");
		sb.append("La especie es "+especie+"\n");
		sb.append("El valor de ataque es "+valorDeAtaque+"\n");
		sb.append("El valor de defensa es "+valorDeDefensa+"\n");
		sb.append("El numero de ataques es "+numAtaques+"\n");
		return sb.toString();
	}
	
}
