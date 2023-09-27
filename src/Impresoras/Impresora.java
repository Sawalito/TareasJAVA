package Impresoras;

public class Impresora {
	private char tipo;
	private static int folio=500;
	private int clave;
	private int mes;
	private char color;
	private int velocidad;
	
	public Impresora(char tipo,int mes, char color) {
		super();
		this.tipo = tipo;
		this.clave=folio++;
		this.mes = mes;
		this.color = color;
		this.velocidad=22;
	}
	
	public Impresora(char tipo,int mes) {
		super();
		this.tipo = tipo;
		this.clave=folio++;
		this.mes = mes;	
		switch(tipo) {
			case 'L':
				this.velocidad=24;
				this.color = 'S';
				break;
			case 'M':
				this.velocidad=30;
				this.color = 'N';
				break;
			default:
				break;
		}
	}

	public char getTipo() {
		return tipo;
	}

	public int getClave() {
		return clave;
	}

	public int getMes() {
		return mes;
	}

	public char getColor() {
		return color;
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public double VenderImpresora() {
		double costo=0;
		switch(tipo) {
			case 'L':
				costo=4500;
				break;
			case 'I':
				if(color=='S')
					costo=4000;
				else
					costo=3500;
				break;
			case 'M':
				costo=2000;
				break;
			default:
				break;
		}
		return costo;
	}
	
	public boolean Mantenimiento(int mes) {
		if(mes==this.mes)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("clave: "+clave+"\n");
		sb.append("velocidad: "+velocidad+"\n");
		sb.append("color: "+color+"\n");
		sb.append("mes: "+ mes +" \n");
		return sb.toString();
	}
	
	public boolean equals(Impresora impresora) {
		if(clave==impresora.getClave())
			return true;
		else
			return false;
		
	}
	
	public int CompareTo(Impresora impresora) {
		if(clave==impresora.getClave())
			return 0;
		else
			if(clave<impresora.getClave())
				return -1;
			else
				return 1;
	}

}
