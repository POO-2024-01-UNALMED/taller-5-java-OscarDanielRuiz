package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {	
	}
	
	public Zoologico(String nombre) {
		this.nombre = nombre;
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
		zonas.setZoo(this);
	}
	
	public void agregarZonas(ArrayList<Zona> zonas) {
		if (zonas.size() == 1)
			this.zonas.add(zonas.get(0));
		else {
			for (int i = 0; i < zonas.size(); i++)
				this.zonas.add(zonas.get(i));
		}
	}
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for (int i = 0; i < zonas.size(); i++)
			cantidad += zonas.get(i).cantidadAnimales();
		return cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setZona(Zona zonas) {
		if (this.zonas == null)
			this.zonas = new ArrayList<Zona>();
		this.zonas.add(zonas);
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public ArrayList<Zona> getZona() {
		return zonas;
	}
}
