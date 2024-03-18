package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		this(null, 0, null, null, false, 0);
		listado.add(this);
	}
	
	public Mamifero(String nombre) {
		super(nombre);
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad) {
		super(nombre, edad);
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		listado.add(this);
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		caballos ++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones ++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public static int cantidadMamiferos() {
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
