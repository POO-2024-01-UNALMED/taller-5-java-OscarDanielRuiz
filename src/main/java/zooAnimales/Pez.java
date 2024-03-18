package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	private static ArrayList<Pez> listado;
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		this(null, 0, null, null, null, 0);
		listado.add(this);
	}
	
	public Pez(String nombre) {
		super(nombre);
		listado.add(this);
	}
	
	public Pez(String nombre, int edad) {
		super(nombre, edad);
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones ++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos ++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public static int cantidadPeces() {
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
