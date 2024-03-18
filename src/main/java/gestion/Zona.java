package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
	}
	
	public Zona(String nombre) {
		this.nombre = nombre;
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
		zoo.agregarZonas(this);
	}
	
	public Zona(String nombre, Zoologico zoo, Animal animal) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
		zoo.agregarZonas(this);
		animales.add(animal);
	}
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
		zoo.agregarZonas(this);
		if (animales.size() == 1)
			this.animales.add(animales.get(0));
		else {
			for (int i = 0; i < animales.size();i++ ) {
				this.animales.add(animales.get(i));
			}
		}
		
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public void agregarAnimales(ArrayList<Animal> animales) {
		if (animales.size() == 1)
			this.animales.add(animales.get(0));
		else {
			for (int i = 0; i < animales.size();i++ ) {
				this.animales.add(animales.get(i));
			}
		}
	}
	
	public int cantidadAnimales() {
		if (animales==null)
			return 0;
		else
			return animales.size();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		if (this.zoo == null)
			this.zoo = new Zoologico[1];
		this.zoo[0] = zoo;		
	}
	
	public Zoologico getZoo() {
		return zoo[0];
	}
}
