package entidades;

public class Profesor extends Empleado {
public Departamento depto;

public Profesor() {
	super();
}


public Profesor(String nom, String ape, estadoCivil Estado, int dni, int anioIncorp, Departamento depto) {
	super(nom, ape, Estado, dni, anioIncorp);
	this.depto = depto;
}


public Profesor(Departamento depto) {
	super();
	this.depto = depto;
}
public void mostrar() {
	super.mostrar();
	depto.mostrar();
}

public Departamento getDepto() {
	return depto;
}

public void setDepto(Departamento depto) {
	this.depto = depto;
}


}

