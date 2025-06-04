import java.util.Scanner;

public class PrincipalApp {
static Scanner scan = new Scanner (System.in);
	
    public static void main(String[] args) {
    	
    	String frase = "";
    	System.out.println("Introduce la frase");
    	frase = scan.next();
    	
        NumeroConsonantes frases = new NumeroConsonantes(frase);
        int numcons = frases.contarConsonantes();
        System.out.println("Número de consonantes: " + numcons);
        
	    int a,b,c,d,e,f;
	    System.out.println("Introduce 6 edades");
	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();
	    d = scan.nextInt();
	    e = scan.nextInt();
	    f = scan.nextInt();
	    int[] edades = {a, b, c, d, e, f};
	    ContarMayoresEdad contador = new ContarMayoresEdad(edades);
	    String resultado = contador.contarMayoresDeEdad();
	    System.out.println(resultado);
	}
}
