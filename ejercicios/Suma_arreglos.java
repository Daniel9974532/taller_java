//ejercicio practico #6
public class Suma_arreglos {
	
	    public static int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {
	        
	        int longitud = arreglo1.length;
	        int[] resultado = new int[longitud];
	        
	        for (int i = 0; i < longitud; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	        }

	        return resultado;
	    }

	    public static void main(String[] args) {
	        int[] arreglo1 = {3, 7, 5};
	        int[] arreglo2 = {8, 6, 6};
	       
	        int[] resultado = sumaArreglos(arreglo1, arreglo2);
	        
	        System.out.print("Resultado: ");
	        for (int i = 0; i < resultado.length; i++) {
	            System.out.print(resultado[i] + " ");
	        }
	    }
	}

