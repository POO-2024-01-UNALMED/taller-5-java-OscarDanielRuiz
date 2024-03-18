package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	public Ave() {
		this(null, 0, null, null, null);
	}
	
	public Ave(String nombre) {
		super(nombre);
		listado.add(this);
	}
	
	public Ave(String nombre, int edad) {
		super(nombre, edad);
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
		
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones ++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas ++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public static int cantidadAves() {
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

