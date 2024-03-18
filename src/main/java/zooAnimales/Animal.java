package zooAnimales;
import gestion.*;

public class Animal {
	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
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
		this.zona = zona;
		totalAnimales++;
	}
	
	public String movimiento() {
		String cadena = "desplazarse";
		return cadena;
	}
	
	public static String totalPorTipo() {
		String cadena = "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+"Aves: "+Ave.cantidadAves()+"\n"+
				"Reptiles: "+Reptil.cantidadReptiles()+"\n"+"Peces: "+Pez.cantidadPeces()+"\n"+"Anfibios: "+
				Anfibio.cantidadAnfibios();
		return cadena;
	}
	
	public String toString() {
		String cadena = "";
		if (zona == null)
			cadena = "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() +
			" y mi genero es " + getGenero();
		else
			cadena = "Mi nombre es " + getNombre() + ", tengo una edad de " + getEdad() + ", habito en " + getHabitat() +
					" y mi genero es " + getGenero() + ", la zona en la que me ubico es " + getZona() + ", en el " 
					+ getZona().getZoo().getNombre();
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
		this.zona = zona;
	}
	
	public Zona getZona() {
		return zona;
	}
}
