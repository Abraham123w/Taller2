package model;

import java.util.ArrayList;

public class Cafeteria {
	private String nombre;
	private String direcion;
	private String faceebook;
	private String instagram;
	private String twitter;
	ArrayList<Caffe> caffes;
	public Cafeteria(String nombre, String direcion, String faceebook, String instagram, String twitter) {
		this.nombre = nombre;
		this.direcion = direcion;
		this.faceebook = faceebook;
		this.instagram = instagram;
		this.twitter = twitter;

	}



	//public ArrayList<Caffe> caffes = new ArrayList<Caffe>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String aNombre) {
		this.nombre = aNombre;
	}

	public String getDirecion() {
		return this.direcion;
	}

	public void setDirecion(String aDirecion) {
		this.direcion = aDirecion;
	}

	public String getFaceebook() {
		return this.faceebook;
	}

	public void setFaceebook(String aFaceebook) {
		this.faceebook = aFaceebook;
	}

	public void setInstagram(String aInstagram) {
		this.instagram = aInstagram;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String aTwitter) {
		this.twitter = aTwitter;
	}

	public void agregarCaffe() {
		throw new UnsupportedOperationException();
	}

	public void obtenerListaCaffePorTamano() {
		throw new UnsupportedOperationException();
	}

	public String getInstagram() {
		return this.instagram;
	}

	public void eliminarCaffe() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Cafeteria{" +
				"nombre='" + nombre + '\'' +
				", direcion='" + direcion + '\'' +
				", faceebook='" + faceebook + '\'' +
				", instagram='" + instagram + '\'' +
				", twitter='" + twitter + '\'' +
				", caffes=" + caffes +
				'}';
	}

	public ArrayList<Caffe> getCaffes() {
		return caffes;
	}

	public void setCaffes(ArrayList<Caffe> caffes) {
		this.caffes = caffes;
	}

}