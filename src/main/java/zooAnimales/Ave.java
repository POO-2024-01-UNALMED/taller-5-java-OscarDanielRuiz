package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	private static ArrayList<Ave> listado;
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public Ave(String nombre, int edad) {
		this.nombre = nombre;;
		this.edad = edad;
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
		
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones += 1;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas += 1;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public int cantidadAves() {
		return listado.size();
	}
	
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public String movimiento() {
		String cadena = "volar";
		return cadena;
	}

}

