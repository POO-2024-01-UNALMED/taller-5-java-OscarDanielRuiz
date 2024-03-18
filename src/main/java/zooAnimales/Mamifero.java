package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	private static ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		listado.add(this);
	}
	
	public Mamifero(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad) {
		this.nombre = nombre;;
		this.edad = edad;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos += 1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones += 1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int getPatas() {
		return patas;
	}
}
