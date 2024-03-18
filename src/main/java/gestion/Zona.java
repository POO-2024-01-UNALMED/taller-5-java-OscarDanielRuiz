package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona() {
	}
	
	public Zona(String nombre) {
		this.nombre = nombre;
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public void agregarAnimales(ArrayList<Animal> animales) {
		for (int i = 0; i < animales.size();i++ ) {
			this.animales.add(animales.get(i));
		}
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;		
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
}
