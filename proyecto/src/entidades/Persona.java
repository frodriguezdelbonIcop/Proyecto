package entidades;
import java.util.*;
public abstract class Persona {
private static int num=1;
private String nombre;
private String apellido;
private int numId;
private estadoCivil estado;
private int dni;

Scanner sc = new Scanner(System.in);

public Persona() {
	System.out.println("Registra una nueva Persona");
	System.out.print("Ingrese Apellido: ");
	this.apellido=sc.nextLine();
	System.out.print("Ingrese Nombre: ");
	this.nombre=sc.nextLine();
	System.out.println("Ingrese DNI: ");
	this.dni=sc.nextInt();
	this.numId=num;
	num++;
	System.out.println("Ingrese estado civil: {1)Soltero, 2)Casado, 3)Viudo, 4)Divorciado");
	int EstCivil=sc.nextInt();
	switch(EstCivil) {
	case 1:
		this.estado=estadoCivil.SOLTERO;
		break;
	case 2:
		this.estado= estadoCivil.CASADO;
		break;
	case 3:
		this.estado= estadoCivil.VIUDO;
		break;
	case 4:
		this.estado= estadoCivil.DIVORCIADO;
		break;
		default:
			System.out.println("No ingreso una opcion valida, no se le asigno estado civil");
			this.estado=null;
	}
	
}
public Persona(String nom, String ape, estadoCivil Estado, int dni) {
	this.nombre = nom;
	this.apellido = ape;
	this.estado=Estado;
	this.numId=num;
	num++;
	this.dni=dni;
}
public void mostrar() {
	System.out.println("Nombre: "+nombre+"Apellido: "+ apellido+"Estado Civil: "+this.estado +"DNI: "+this.dni);
	System.out.println("ID: "+this.numId);
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public estadoCivil getEstado() {
	return estado;
}
public void setEstado() {
	System.out.println("Ingrese estado civil: 1-Soltero, 2-Casado, 3-Viudo, 4-Divorciado");
	int esCivil=sc.nextInt();
	switch(esCivil) {
	case 1:
		this.estado=estadoCivil.SOLTERO;
		break;
	case 2:
		this.estado= estadoCivil.CASADO;
		break;
	case 3:
		this.estado= estadoCivil.VIUDO;
		break;
	case 4:
		this.estado= estadoCivil.DIVORCIADO;
		break;
		default:
			System.out.println("No ingreso una opcion valida, no se le asigno estado civil");
			this.estado=null;
	}
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public int getNumId() {
	return numId;
}
public void setNumId(int numId) {
	this.numId = numId;
}


}
