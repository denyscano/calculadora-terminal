package es.daw.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double primero = 0;
        double segundo = 0;
        double resultado = 0;

        do {
            System.out.println();
            System.out.println("======================================");
            System.out.println("       CALCULADORA SUPER TOTAL");
            System.out.println("======================================");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz cuadrada");
            System.out.println("7. Seno (grados)");
            System.out.println("8. Coseno (grados)");
            System.out.println("9. Celsius a Fahrenheit");
            System.out.println("10. Fahrenheit a Celsius");
            System.out.println("11. Kilometros a millas");
            System.out.println("12. Millas a kilometros");
            System.out.println("13. Kilogramos a libras");
            System.out.println("14. Libras a kilogramos");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5) {
                System.out.print("Escribe el primer numero: ");
                primero = teclado.nextDouble();
                System.out.print("Escribe el segundo numero: ");
                segundo = teclado.nextDouble();
                resultado = calcular(opcion, primero, segundo);
                System.out.println("El resultado final es: " + resultado);
            } else if (opcion == 6 || opcion == 7 || opcion == 8 || opcion == 9
                    || opcion == 10 || opcion == 11 || opcion == 12 || opcion == 13
                    || opcion == 14) {
                System.out.print("Escribe el valor: ");
                primero = teclado.nextDouble();
                segundo = 0;
                resultado = calcular(opcion, primero, segundo);

                if (opcion == 6) {
                    System.out.println("La raiz es: " + resultado);
                }
                if (opcion == 7) {
                    System.out.println("El seno de " + primero + " grados es " + resultado);
                }
                if (opcion == 8) {
                    System.out.println("El coseno de " + primero + " grados es " + resultado);
                }
                if (opcion == 9) {
                    System.out.println(primero + " Celsius son " + resultado + " Fahrenheit");
                }
                if (opcion == 10) {
                    System.out.println(primero + " Fahrenheit son " + resultado + " Celsius");
                }
                if (opcion == 11) {
                    System.out.println(primero + " kilometros son " + resultado + " millas");
                }
                if (opcion == 12) {
                    System.out.println(primero + " millas son " + resultado + " kilometros");
                }
                if (opcion == 13) {
                    System.out.println(primero + " kilogramos son " + resultado + " libras");
                }
                if (opcion == 14) {
                    System.out.println(primero + " libras son " + resultado + " kilogramos");
                }
            } else if (opcion == 0) {
                System.out.println("Gracias por usar la calculadora");
            } else {
                System.out.println("Opcion no valida. Prueba otra vez.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    public static double calcular(int opcion, double primero, double segundo) {
        double r = -999;

        if (opcion == 1) {
            r = primero + segundo;
        } else if (opcion == 2) {
            r = primero - segundo;
        } else if (opcion == 3) {
            r = primero * segundo;
        } else if (opcion == 4) {
            if (segundo == 0) {
                r = 0;
            } else {
                r = primero / segundo;
            }
        } else if (opcion == 5) {
            r = Math.pow(primero, segundo);
        } else if (opcion == 6) {
            if (primero < 0) {
                r = Math.sqrt(primero * -1);
            } else {
                r = Math.sqrt(primero);
            }
        } else if (opcion == 7) {
            r = Math.sin(primero);
        } else if (opcion == 8) {
            r = Math.cos(primero * 3.14 / 180);
        } else if (opcion == 9) {
            r = primero * 1.8 + 32;
        } else if (opcion == 10) {
            r = primero - 32 / 1.8;
        } else if (opcion == 11) {
            r = primero * 0.62;
        } else if (opcion == 12) {
            r = primero * 1.6;
        } else if (opcion == 13) {
            r = primero * 2.2;
        } else if (opcion == 14) {
            r = primero / 2.2;
        }

        return r;
    }
}
