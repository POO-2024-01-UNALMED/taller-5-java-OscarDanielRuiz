package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	private static ArrayList<Reptil> listado;
	public static int iguanas = 0;
	public static int serpientes = 0;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad) {
		this.nombre = nombre;;
		this.edad = edad;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		listado.add(this);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.nombre = nombre;;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas += 1;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes += 1;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public int cantidadReptiles() {
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
