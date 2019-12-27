public class Contacto implements Comparable <Contacto>{
	protected String nombre = new String();
	protected String numero = new String();

	public Contacto(String name, String number){
		this.nombre = name;
		this.numero = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		}if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Contacto con){
		return 0;
	}

	@Override
	public String toString() {
		return "Contacto [Nombre=" + nombre + ", numero=" + numero + "]";
	}
}