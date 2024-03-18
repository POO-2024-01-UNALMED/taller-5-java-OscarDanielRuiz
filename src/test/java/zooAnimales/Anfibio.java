package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal{
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	private static ArrayList<Anfibio> listado;
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad) {
		this.nombre = nombre;;
		this.edad = edad;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas += 1;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras += 1;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	
	public void setColorPiel(String color) {
		colorPiel = color;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setLargoCola(boolean veneno) {
		venenoso = veneno;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
	
	public String movimiento() {
		String cadena = "saltar";
		return cadena;
	}
}
