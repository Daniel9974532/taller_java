//ejercicio practico #3
import java.util.Random;
public class Aleatorio {	
	    public static int aleatorio() {	        
	        Random random = new Random();	        
	        int num_a = random.nextInt(100) + 1;	       
	        return num_a;
	    }

	    public static void main(String[] args) {
	        int num = aleatorio();
	        System.out.println("El numero es: " + num);	    
	}

}
