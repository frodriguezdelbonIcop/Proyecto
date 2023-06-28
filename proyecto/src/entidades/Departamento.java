package entidades;
import java.util.*;
public class Departamento {
private String nombre;
Scanner sc = new Scanner(System.in);
public Departamento() {
	System.out.println("Ingrese Nombre del Departamento: ");
	this.nombre=sc.nextLine();
}
public Departamento(String nombre) {
	this.nombre = nombre;
}
public void mostrar() {
	System.out.println("Nombre de departamento: "+this.nombre);
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
