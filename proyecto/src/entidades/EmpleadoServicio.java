package entidades;
import java.util.*;
public class EmpleadoServicio extends Empleado {
private Seccion Seccion;

public EmpleadoServicio(String nom, String ape, estadoCivil EstadoCiv, int dni, int anioIncorp,
		entidades.Seccion seccion) {
	super(nom, ape, EstadoCiv, dni, anioIncorp);
	Seccion = seccion;
}
public EmpleadoServicio() {
	super();
	
}
public EmpleadoServicio(Seccion seccion) {
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


