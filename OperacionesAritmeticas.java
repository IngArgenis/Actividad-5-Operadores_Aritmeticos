public class OperacionesAritmeticas {
    public static void main(String[] args) {
        
        //Declaración de las 3 variables con sus atributos numericos
        float valor1 = 12.5f;
        float valor2 = 3.5f;
        float valor3 = 2.0f;

        //Declaración de las 4 variables para almacenar los resultados de las operaciones
        float Op1, Op2, Op3, Op4;

        // Operaciones Aritmeticas
        Op1 = (valor1 + valor2) - valor3;
        Op2 = (valor2 - valor3) * valor1;
        Op3 = (valor1 * valor2) * valor3;
        Op4 = (valor3 / valor1) + valor2;

        //Mostramos los resultados en pantalla
        System.out.println("RESULTADOS DE LAS OPERACIONES ARITMETICAS");
        System.out.println("Primer valor = " + valor1);
        System.out.println("Segundo valor = " + valor2);
        System.out.println("Tercer valor = " + valor3);
        System.out.println("Primera operación: " + Op1);
        System.out.println("Segunda operación: " + Op2);
        System.out.println("Tercera operación: " + Op3);
        System.out.println("Cuarta operación: " + Op4);
    }
}
