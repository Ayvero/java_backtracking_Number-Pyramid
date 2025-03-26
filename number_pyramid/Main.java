package Backtracking_Ej8;



/**
 * Ejercicio 8. Colocar un entero positivo (menor que un cierto valor entero k
 * dado) en cada casilla de una pir�mide de base B (valor entero dado) de modo
 * que cada n�mero sea igual a la suma de las casillas sobre las que est�
 * apoyado. Los n�meros de todas las casillas deben ser diferentes.
 * 
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		int K = 15;
		int base = 5;
		
		Backtracking backtracking = new Backtracking(K, base);
		
		backtracking.generarPiramide();

	}

}
