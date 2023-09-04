//ejercicio practico #5
public class Valor_maximo {
	
	    public static int Maximo(int[] arreglo) {

	        int maximo = arreglo[0]; 
	        for (int i = 1; i < arreglo.length; i++) {
	            if (arreglo[i] > maximo) {
	                maximo = arreglo[i];
	            }
	        }

	        return maximo;
	    }

	    public static void main(String[] args) {
	        int[] arreglo = {89, 1, 8, 22, 78, 48};
	        
	        int maximo = Maximo(arreglo);
	        
	        System.out.println("El valor es: " + maximo);	    
	}

}
