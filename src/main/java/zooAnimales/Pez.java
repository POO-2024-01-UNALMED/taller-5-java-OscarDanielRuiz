package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	private static ArrayList<Pez> listado;
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad) {
		this.nombre = nombre;;
		this.edad = edad;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones += 1;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos += 1;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int largo) {
		cantidadAletas = largo;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public String movimiento() {
		String cadena = "nadar";
		return cadena;
	}
}
