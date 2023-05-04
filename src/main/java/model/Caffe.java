package model;

public class Caffe {
	private int gramos;
	private int mililitrosAgua;
	private String tamano;
	private String ingredienteAdicional;

	public Caffe(int gramos, int mililitrosAgua, String tamano, String ingredienteAdicional) {
		this.gramos = gramos;
		this.mililitrosAgua = mililitrosAgua;
		this.tamano = tamano;
		this.ingredienteAdicional = ingredienteAdicional;
	}

	public int getGramos() {
		return this.gramos;
	}

	public void setGramos(int aGramos) {
		this.gramos = aGramos;
	}

	public int getMililitrosAgua() {
		return this.mililitrosAgua;
	}

	public void setMililitrosAgua(int aMililitrosAgua) {
		this.mililitrosAgua = aMililitrosAgua;
	}

	public String getTamano() {
		return this.tamano;
	}

	public void setTamano(String aTamano) {
		this.tamano = aTamano;
	}

	public String getIngredientesOpcionales() {
		throw new UnsupportedOperationException();
	}

	public void setIngredientesOpcionales(String aIngredientesOpcionales) {
		throw new UnsupportedOperationException();
	}

	public String getIngredienteAdicional() {
		return this.ingredienteAdicional;
	}

	public void setIngredienteAdicional(String aIngredienteAdicional) {
		this.ingredienteAdicional = aIngredienteAdicional;
	}
}