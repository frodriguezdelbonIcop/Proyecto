package entidades;
import java.util.Scanner;
public class DeServicio extends Empleado {
private Seccion Seccion;

public DeServicio(String nom, String ape, estadoCivil EstadoCiv, int dni, int añoIncorp,
		entidades.Seccion seccion) {
	super(nom, ape, EstadoCiv, dni, añoIncorp);
	Seccion = seccion;
}
public DeServicio() {
	super();
	
}
public DeServicio(Seccion seccion) {
	super();
	Seccion = seccion;
}
public void mostrar() {
	super.mostrar();
	Seccion.mostrar();
}
public Seccion getSeccion() {
	return Seccion;
}
public void setSeccion(Seccion seccion) {
	Seccion = seccion;
}


}


