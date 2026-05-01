package principal;

import algoritmos.Algoritmos;
import algoritmos.Busqueda;
import algoritmos.Ordenacion;

public class Principal {
	public static void main(String[] args) {	
		Persona[] personas, personasCopia1, personasCopia2, personasCopia3;
		long tiempo;
		int resul = 0;						// cedula aleatoria			// entre 50kg y 100kg
		Persona persona = new Persona(Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(50, 100));
		
		personas = generarPersonas(100);
		System.out.println("Arreglo De 100 Personas");
		imprimir(personas);
		
		// Copiar el vector
		personasCopia1 = copiar(personas);
		personasCopia2 = copiar(personas);
		personasCopia3 = copiar(personas);
		
		System.out.println("Arreglo Ordenado Por BubbleSort");
		tiempo = System.nanoTime();
		Ordenacion.bubbleSort(personasCopia1); // personaCopia1 ordenada con bubbleSort
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos");
		imprimir(personasCopia1);
		
		tiempo = System.nanoTime();
		System.out.println("Arreglo Ordenado Por Seleccion");
		Ordenacion.seleccion(personasCopia2); // personaCopia2 ordenada con seleccion
		tiempo = System.nanoTime()-tiempo;
		System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos");
		imprimir(personasCopia2);
		
		tiempo = System.nanoTime();
		System.out.println("Arreglo Ordenado Por Insercion");
		Ordenacion.insercion(personasCopia3); // personaCopia3 ordenada con insercion
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos");
		imprimir(personasCopia3);
		
		System.out.println("Busqueda Secuencial Sin Ordenar");
		tiempo = System.nanoTime();
		resul = Busqueda.busquedaSecuencial(persona, personas);
		tiempo = System.nanoTime() - tiempo;
      	System.out.println(persona + (resul == -1 ? "\nDato No Encontrado" : "Dato Encontrado En La Posicion: " + resul));
    	System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos\n");
      	
      	System.out.println("Busqueda Secuencial En Arreglo Ordenado");
		tiempo = System.nanoTime();
		resul = Busqueda.busquedaSecuencial(persona, personasCopia1);
		tiempo = System.nanoTime() - tiempo;
		System.out.println(persona + (resul == -1 ? "\nDato No Encontrado" : "Dato Encontrado En La Posicion: " + resul));
		System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos\n");
		
	 	System.out.println("Busqueda Binaria En Arreglo Ordenado");
		tiempo = System.nanoTime();
		resul = Busqueda.busquedaBinaria(persona, personasCopia2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println(persona + (resul == -1 ? "\nDato No Encontrado" : "Dato Encontrado En La Posicion: " + resul));
		System.out.println("Tiempo Ejecucion: " + tiempo + " nanosegundos\n");


	}
	
	public static Persona[] generarPersonas(int n) {
		Persona[] vector = new Persona[n];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = new Persona(Algoritmos.cedulaAleatorio(), Algoritmos.aleatorio(50, 100)); // genera los datos para la cedula y el peso entre 50kg y 100kg
		}
		
		return vector;
	}
	
	public static <T> T[] copiar(T[] a) {
		return a.clone();
	}
	
	public static <T> void imprimir(T[] a) {
		for(T elem : a) {
			System.out.println(elem.toString());
		}
	}

}
