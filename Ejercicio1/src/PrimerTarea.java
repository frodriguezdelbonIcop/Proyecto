import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimerTarea {
	
	public static void main(String[] args) throws IOException {
		   
		System.out.println("Ingrese el primer numero: ");
		Integer numero1 = cargarNumero();
		System.out.println("Ingrese el segundo numero: ");
		Integer numero2 = cargarNumero();
		Integer numeroCombi = numero1+numero2;
		System.out.println("El resultado es "+numeroCombi);
		System.out.println("Ingresa tu nombre");
	
		String nombre = cargarNombre();
		System.out.println("Mi nombre es: "+nombre);
	
		System.out.println("Ingresa una frase en minusculas");
		
		String frase = cargarNombre();
		
		System.out.println(frase.toUpperCase());

		System.out.println(frase.toLowerCase());
	

		System.out.println("Ingresa los grados");
		Integer grados = cargarNumero();

		Integer fah = (9*(grados/5))+32;
		System.out.println("Los grados en Fah son: "+fah);
		System.out.println("Ingresa un numero y te dirá el doble, triple y raíz cuadrada");
		Integer numeroCadena = cargarNumero();
		
		System.out.println(numeroCadena*2);
		System.out.println(numeroCadena*3);
		System.out.println(Math.sqrt(numeroCadena));
		

		
		

	}
	private static Integer cargarNumero() throws IOException{
		InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		String strNumero1 = buffer.readLine();
		Integer numero = Integer.parseInt(strNumero1);
		return numero;
	}
	
	private static String cargarNombre() throws IOException{
		InputStreamReader capturarTeclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader (capturarTeclado);
		String nombre = buffer.readLine();
		return nombre;
		
	
	}

}
