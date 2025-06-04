public class ContarMayoresEdad {
    private int[] edades;

    public ContarMayoresEdad(int[] edades) {
        this.edades = edades;
    }

    public String contarMayoresDeEdad() {
        int numero = 0;
        for (int edad : edades) {
            if (edad >= 18) {
            	numero++;
            }
        }
        return "Hay " + numero + " personas que son mayores de edad.";
    }
}
