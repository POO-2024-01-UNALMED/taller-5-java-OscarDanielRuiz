package zooAnimales;
import gestion.*;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(String nombre) {
		this.nombre = nombre;
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = new Zona[1];
		this.zona[0] = zona;
		totalAnimales++;
	}
	
	public String movimiento() {
		String cadena = "desplazarse";
		return cadena;
	}
	
	public static String totalPorTipo() {
		String cadena = "Mamiferos: cant\n" + "Aves: cant\n" + "Reptiles: cant\n" + "Peces: cant\n" + "Anfibios: cant";
		return cadena;
	}
	
	public String toString() {
		String cadena = "";
		if (zona == null)
			cadena = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
			" y mi genero es " + genero;
		else
			cadena = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat +
			" y mi genero es " + genero + ", la zona en la que me ubico es " + zona + ", en el " 
					+ zona[0].getZoo().getNombre();
		return cadena;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setZona(Zona zona) {
		if (this.zona == null)
			this.zona = new Zona[1];
		this.zona[0] = zona;
	}
	
	public Zona getZona() {
		return zona[0];
	}
}
