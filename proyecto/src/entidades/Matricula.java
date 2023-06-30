package entidades;
import java.util.*;
public class Matricula {
private Curso curso;
private ArrayList<Estudiante>alumnos;
private int anio;


public Matricula(Curso curso, int año) {
	super();
	this.curso = curso;
	this.anio = año;
	alumnos= new ArrayList();
}
public void agregarAlumno(Estudiante alumno) {
	alumnos.add(alumno);
}
public void mostrarInscriptos() {
	for (int i=0;i<alumnos.size();i++) {
		System.out.println(alumnos.get(i).getNombre()+" "+alumnos.get(i).getApellido()+", ");
	}
}
public void mostrar() {
	System.out.println("ID: "+this.curso.getIdCurso()+", Nombre: "+this.curso.getNombre());
	System.out.println("Año: "+this.anio);
	for (int i=0;i<alumnos.size();i++) {
		System.out.println((alumnos.get(i)).getNombre()+" "+(alumnos.get(i).getApellido())+", ");
	}
	System.out.println();
}

public Curso getCurso() {
	return this.curso;
}
public void setIdCurso(Curso curso) {
	this.curso = curso;
}
public int getAño() {
	return anio;
}
public void setAño(int año) {
	this.anio = año;
}




}
