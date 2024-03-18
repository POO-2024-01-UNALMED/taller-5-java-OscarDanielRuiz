package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		this(null, 0, null, null, null, 0);
		listado.add(this);
	}
	
	public Reptil(String nombre) {
		super(nombre);
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad) {
		super(nombre, edad);
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat) {
		super(nombre, edad, habitat);
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero) {
		super(nombre, edad, habitat, genero);
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas ++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes ++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int largo) {
		largoCola = largo;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public String movimiento() {
		String cadena = "reptar";
		return cadena;
	}
}
