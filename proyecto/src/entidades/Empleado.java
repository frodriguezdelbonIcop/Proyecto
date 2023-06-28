package entidades;
import java.util.*;
public abstract class Empleado extends Persona {
private boolean Activo=true;
private static int nro=1;
private int nroLegajo;
private int anioIncorp;
public Empleado() {
	super();
	Scanner sc = new Scanner(System.in);
	System.out.println("Registre al Empleado");

	System.out.println("Ingresar año de incorporacion: ");
	this.anioIncorp=sc.nextInt();
	this.nroLegajo=nro++;
	this.Activo=true;
	
}

public Empleado(String nom, String ape, estadoCivil EstadoCiv, int dni, int anioIncorp) {
	super(nom, ape, EstadoCiv, dni);
	this.anioIncorp = anioIncorp;
	this.nroLegajo = nro++;
}

public Empleado(int anioIncorp) {
	super();
	this.nroLegajo = nro++;
	this.anioIncorp = anioIncorp;
	this.Activo=true;
}
public void mostrar() {
	super.mostrar();
	System.out.println("Nro Legajo: "+this.nroLegajo+", Año de incorporación: "+this.anioIncorp);
	System.out.println("¿Está activo?: "+Activo);
}
public boolean isEsActivo() {
	return Activo;
}
public void setEsActivo(boolean esActivo) {
	this.Activo = esActivo;
}
public int getNroLegajo() {
	return nroLegajo;
}
public void setNroLegajo(int nroLegajo) {
	this.nroLegajo = nroLegajo;
}
public int getAnioIncorp() {
	return anioIncorp;
}
public void setAnioIncorp(int añoIncorp) {
	this.anioIncorp = añoIncorp;
}

public void cambiarLegajo() {
	this.Activo=false;
}


}
