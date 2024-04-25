package persona;

public class Persona {

	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	
/**
 * 
 * Constructor con los parámetros:
 * 
 * @param nombre
 * @param peso
 * @param altura
 * @param edad
 */
	
	public Persona(String nombre, int peso, int altura, int edad) {

		this.peso = peso;
		this.setEdad(edad);
		this.altura = altura;
		this.nombre = nombre;

	}
	
	/**
	 * 
	 * @return de nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre el nombre que settea
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return del peso
	 */
	public int getPeso() {
		return peso;
	}
	/**
	 * 
	 * @param peso que es el peso que settea
	 */

	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * 
	 * @return de la altura 
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * 
	 * @param altura que es la altura que settea
	 */

	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * 
	 * @return  de edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad que settea la edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo to string que permite imprimir la persona
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + "]";
	}

	
	
	
	
}
