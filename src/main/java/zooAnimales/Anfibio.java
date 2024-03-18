package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this(null, 0, null, null, null, false);
		listado.add(this);
	}
	
	public Anfibio(String nombre) {
		super(nombre);
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad) {
		super(nombre, edad);
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas ++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras ++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public static int cantidadAnfibios() {
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
