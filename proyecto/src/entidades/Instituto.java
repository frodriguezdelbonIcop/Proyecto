package entidades;
import java.util.*;
public class Instituto {
private String nombre;
private String direccion;
private HashMap<Integer, Curso>cursos;
private ArrayList<Persona>personas;
private ArrayList<Departamento>deptos;
private ArrayList<Seccion>secciones;
private ArrayList<Matricula>gruposDeCursado;

Scanner sc = new Scanner(System.in);
public Instituto() {
	System.out.print("Ingrese Nombre del instituto: ");
	this.nombre=sc.nextLine();
	System.out.print("Ingrese Direccion: ");
	this.direccion=sc.nextLine();
	this.personas=new ArrayList();
	this.cursos=new HashMap();
	this.deptos=new ArrayList();
	this.secciones=new ArrayList();
	this.gruposDeCursado=new ArrayList();
}

public Instituto(String nombre, String direccion) {
	this.nombre = nombre;
	this.direccion = direccion;
	this.personas=new ArrayList();
	this.cursos=new HashMap();
	this.deptos=new ArrayList();
	this.secciones=new ArrayList();
	this.gruposDeCursado=new ArrayList();

}
public void mostrar() {
	System.out.println("Nombre: "+this.nombre);
	System.out.println("Direccion: "+this.direccion);
	System.out.println("Cursos dictados:");
	for (Map.Entry<Integer, Curso> entry : cursos.entrySet()) {
		Curso curso=entry.getValue();
		System.out.print(curso.getNombre()+", ");
	}	
	System.out.println();
	System.out.println("Departamentos:");
	for (int i=0;i<deptos.size();i++) {
		System.out.print(deptos.get(i).getNombre()+", ");
	}
	System.out.println();
	System.out.println("Secciones:");
	for (int i=0;i<secciones.size();i++) {
		System.out.print(secciones.get(i).getNombre()+", ");
	}
	System.out.println();
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}
// -- Personas --
public void agregarPersona() {
	System.out.println("Ingrese opcion:" );
	System.out.println("1)Agregar Alumno"
			+"\n2)Agregar Profesor"
			+"\n3)Agregar Empleado De Servicio");
	int op = sc.nextInt();
	switch(op) {
	case 1: 
		Estudiante alumno = new Estudiante();
		this.personas.add(alumno);
		break;
	case 2:
		System.out.println("Los departamentos son: ");
		for(int i = 0; i<deptos.size();i++) {
			System.out.print(i+")"+(deptos.get(i)).getNombre()+", ");
		}
		System.out.println("\nIngrese el nro del departamento que desea vincular: ");
		int nro = sc.nextInt();
		for(int i = 0; i<deptos.size();i++) { 
			if (nro == i) {
			Profesor profesor = new Profesor(deptos.get(i));
			personas.add(profesor);
			}
		}
		break;
	case 3: 
		System.out.println("Las secciones son: ");
		for(int i = 0; i<secciones.size();i++) {
			System.out.print(i+")"+(secciones.get(i)).getNombre()+", ");
		}
		System.out.println("\nIngrese el nro de la seccion que desea vincular: ");
		int num = sc.nextInt();
		for(int i = 0; i<deptos.size();i++) { 
			if (num == i) {
			EmpleadoServicio servicio = new EmpleadoServicio(secciones.get(i));
			personas.add(servicio);
			}
		}
		break;
		default:
			System.out.println("No ingreso una opcion correcta.");
	}
	
}
public void mostrarPersonas() {
	System.out.println("Seleccione que desea ver: 1)Alumnos 2)Profesores 3)Empleados de servicio 4)Mostrar todas las personas");
	int e=sc.nextInt();
	switch(e) {
	case 1:
		for (int i=0;i<personas.size();i++) {
			if(personas.get(i) instanceof Estudiante) {
				personas.get(i).mostrar();
			}
		}
		break;
	case 2:
		for (int i=0;i<personas.size();i++) {
			if(personas.get(i) instanceof Profesor) {
				personas.get(i).mostrar();
			}
		}
		break;
	case 3:
		for (int i=0;i<personas.size();i++) {
			if(personas.get(i) instanceof EmpleadoServicio) {
				personas.get(i).mostrar();
			}
		}
		break;
	case 4:
		for (int i=0;i<personas.size();i++) {
			personas.get(i).mostrar();
		}
		break;
	default:
		System.out.println("Opcion no valida");
	}
}
public int buscarPersona() {
	System.out.println("Ingrese filtro de busqueda: 1)Alumnos 2)Empleados 3)Profesor 4)Empleado de Servicio 5)Todas las personas");
	int opc=sc.nextInt();
	System.out.println("Ingrese dni:");
	int dni = sc.nextInt();
	switch(opc) {
	case 1:
		for(int i=0;i<personas.size();i++) {
			if(this.personas.get(i) instanceof Estudiante) {
				if(dni==personas.get(i).getDni()) {
					return i;
				}
			}
		}

	case 2:
		for(int i=0;i<personas.size();i++) {
			if(this.personas.get(i) instanceof Empleado) {
				if(dni==personas.get(i).getDni()) {
					return i;
				}
			}
		}
		break;
	case 3:
		for(int i=0;i<personas.size();i++) {
			if(this.personas.get(i) instanceof Profesor ) {
				if(dni==personas.get(i).getDni()) {
					return i;
				}
			}
		}
		break;
	case 4:
		for(int i=0;i<personas.size();i++) {
			if(this.personas.get(i) instanceof EmpleadoServicio) {
				if(dni==personas.get(i).getDni()) {
					return i;
				}
			}
		}
		break;
	case 5:
		for(int i=0;i<personas.size();i++) {
				if(dni==personas.get(i).getDni()) {
					return i;
				}
			}
	}
	
	return -1;
}
public void agregarPersona(Persona persona){
	personas.add(persona);
}
public void cambiarEstadoCivil() {
	System.out.println("Seleccione persona que desea modificar: ");
	int indiceP=buscarPersona();
	personas.get(indiceP).setEstado();
	
}

// -- Empleado --
public void reasigancionLegajo() {
	int indiceE=buscarPersona();
	if(indiceE!=-1 && personas.get(indiceE)instanceof Empleado) {
		Empleado empleado = (Empleado)personas.get(indiceE);
		if(empleado instanceof Profesor) {
			Profesor profesor = (Profesor)empleado;
			Profesor prof = new Profesor(profesor.getNombre(), profesor.getApellido(), profesor.getEstado(), profesor.getDni(), profesor.getAnioIncorp(), profesor.getDepto());
			prof.setNumId(profesor.getNumId());
			profesor.setDni(0);
			profesor.cambiarLegajo();
			personas.add(prof);
		}else if(empleado instanceof EmpleadoServicio) {
			EmpleadoServicio deservicio = (EmpleadoServicio)empleado;
			EmpleadoServicio servi = new EmpleadoServicio(deservicio.getNombre(), deservicio.getApellido(), deservicio.getEstado(), deservicio.getDni(), deservicio.getAnioIncorp(), deservicio.getSeccion());
			servi.setNumId(deservicio.getNumId());
			deservicio.setDni(0);
			deservicio.cambiarLegajo();
			personas.add(servi);
		}
	}
	
}
//  -- Profesor --
public void cambiarDepto() {
	int indiceP=buscarPersona();
	if (personas.get(indiceP)instanceof Profesor) {
		System.out.println("Seleccione departamento nuevo:");
		System.out.println("Los departamentos disponinles son: ");
		for(int i = 0; i<deptos.size();i++) {
			System.out.print(i+")"+(deptos.get(i)).getNombre()+", ");
		}
		int o=sc.nextInt();
		if (o<deptos.size()) {
			Profesor prof =(Profesor) personas.get(indiceP);
			prof.setDepto(deptos.get(o));
		}
	}else {
		System.out.println("la persona que selecciono no es profesor.");
	}
}
//De Servicio
public void cambiarSeccion() {
	int indiceDS=buscarPersona();
	if (personas.get(indiceDS)instanceof EmpleadoServicio) {
		System.out.println("Seleccione seccion nueva:");
		System.out.println("Las secciones disponinles son: ");
		for(int i = 0; i<secciones.size();i++) {
			System.out.print(i+")"+(secciones.get(i)).getNombre()+", ");
		}
		int o=sc.nextInt();
		if (o<secciones.size()) {
			EmpleadoServicio deser =(EmpleadoServicio) personas.get(indiceDS);
			deser.setSeccion(secciones.get(o));
		}
	}else {
		System.out.println("la persona que selecciono no es empleado de servicio.");
	}
}
// -- Matricula -- | -- Grupo de Cursado --
public void crearNuevoGrupo() {
	System.out.println("Registra un nuevo curso");
	System.out.println("Cursos disponibles:");
	mostrarCursos();
	System.out.print("Ingrese ID de curso: ");
	System.out.println();
	int id=sc.nextInt();
	boolean encontrado=false;
	int index= -1;
	int i=0;
	while(encontrado!=true && i<cursos.size()) {
		if(cursos.containsKey(i)&&cursos.get(i).equals(id)) {
			index=i;
			encontrado=true;
		}
		i++;
	}
	System.out.print("Ingrese año: ");
	int año=sc.nextInt();
	System.out.println();
	if(encontrado!=true) {
		gruposDeCursado.add(new Matricula(cursos.get(i), año));
	}else {
		System.out.println("ERROR: id incorrecto o curso inexistente");
	}
}
public void matricularAlumnoCurso() {
	System.out.println("Cursos disponibles: ");
	for (int i=0;i<gruposDeCursado.size();i++) {
		Curso curso = gruposDeCursado.get(i).getCurso();
		System.out.println(i+")ID: "+curso.getIdCurso()+", NOMBRE: " + curso.getNombre());
		System.out.println("AÑO: "+gruposDeCursado.get(i).getAño());
	}
	System.out.println("Ingrese nro de curso al que desea matricularse: ");
	int indiceGC=sc.nextInt();
	int indiceAL=buscarPersona();
	if(indiceAL!=-1) {
		gruposDeCursado.get(indiceGC).agregarAlumno((Estudiante)personas.get(indiceAL));
		Estudiante alumno = (Estudiante)personas.get(indiceAL);
		alumno.matricularCurso(gruposDeCursado.get(indiceGC));
		}
}
public void matricularAlumnoCurso(Estudiante alumno, Matricula grupoCurso) {
	alumno.matricularCurso(grupoCurso);
	grupoCurso.agregarAlumno(alumno);
}

public void mostrarAlumnosCurso() {
	System.out.println("Seleccione curso: ");
	System.out.println("Los cursos activos son: ");
	for (int i=0;i<gruposDeCursado.size();i++) {
		Curso curso = gruposDeCursado.get(i).getCurso();
		System.out.println(i+")ID: "+curso.getIdCurso()+", NOMBRE: " + curso.getNombre());
		System.out.println("AÑO: "+gruposDeCursado.get(i).getAño());
	}
	int o=sc.nextInt();
	if (o<gruposDeCursado.size()) {
		gruposDeCursado.get(o).mostrarInscriptos();
	}
}

//  -- Cursos --
public void cargarCurso() {
	Curso curso = new Curso();
	agregarCurso(curso);
}
public void agregarCurso(Curso curso) { 
	this.cursos.put(curso.getIdCurso(), curso);
}
public void mostrarCursos() {
for (Map.Entry<Integer, Curso> entry : cursos.entrySet()) {
	Curso curso=entry.getValue();
	int idCurso=entry.getKey();
	System.out.print("ID: "+idCurso+" CURSO:"+ curso.getNombre()+"\n");
}	
System.out.println();
}

//  -- Departamentos --
public void agragrDepto(Departamento depto) {
	this.deptos.add(depto);
}
public void agregarMatricula(Matricula matricula) {
	this.gruposDeCursado.add(matricula);
}
public void agregarSeccion(Seccion seccion) {
	this.secciones.add(seccion);
}
//  -- Secciones --
public void agregarSeccion() {
	Seccion seccion = new Seccion();
	secciones.add(seccion);
	
}
}
