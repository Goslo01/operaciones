//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        double a = 10;   // Creacion de variable A con valor asignado a 10
        double b = 20;     // Creacion de variable B con valor asignado a 5
        operaciones.realizarOperaciones(a, b);
    }

    public static class Operaciones {

        public void realizarOperaciones(double a, double b) {
            System.out.println("El valor asignado de a es: " + a);   // Se muestra en pantalla el valor que se le asigno a la variable A
            System.out.println("El valor asignado de b es: " + b);   // Se muestra en pantalla el valor que se le asigno a la variable B

            System.out.println("Sumar: " + sumar(a, b));         // Se realiza la suma y se muestra en pantalla el resultado
            System.out.println("Restar: " + restar(a, b));       // Se realiza la resta y se muestra en pantalla el resultado
            System.out.println("Multiplicar: " + multiplicar(a, b));  // Se realiza la multiplicacion y se muestra en pantalla el resultado
            System.out.println("Dividir: " + dividir(a, b));  // Se realiza la division y se muestra en pantalla el resultado
            System.out.println("Modulo: " + modulo(a, b));   // Se realiza el modulo y se muestra en pantalla el resultado
        }

        private double sumar(double a, double b) {
            return a + b;
        }

        private double restar(double a, double b) {
            return a - b;
        }

        private double multiplicar(double a, double b) {
            return a * b;
        }

        private double dividir(double a, double b) {
            return a / b;
        }

        private double modulo(double a, double b) {
            return a % b;
        }
    }
}


