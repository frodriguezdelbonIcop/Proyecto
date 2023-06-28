package entidades;

import java.util.*;

public class Seccion {
private String nombre;

Scanner sc = new Scanner(System.in);

public Seccion() {
	super();
	System.out.println("Registre la nueva secciòn");
	System.out.println("Ingrese Nombre: ");
	this.nombre=sc.nextLine();
}

public Seccion(String nombre) {
	super();
	this.nombre = nombre;
}
public void mostrar() {
	System.out.println("Nombre de seccion: "+this.nombre);
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
