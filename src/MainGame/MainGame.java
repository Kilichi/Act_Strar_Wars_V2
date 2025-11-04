package MainGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainGame {

    private final Scanner  scanner = new Scanner(System.in);
    private final Strings Strings = new Strings();
    private final Random random = new Random();
    private final boolean Debug = false;

    /*
    Funcion para sacar informacion en caso de estar habilitado el debug
        @param text (texto a sacar por pantalla)
     */
    private void debugPrint(String text)
    {
        if (this.Debug) {
            System.out.println(text);
        }
    }

    /*
    Funcion para calcular el factorial de un número
        @param num1 (factorial del numero a calcular)
    */
    int factorial(int num1)
    {
        int previo;
        int result = 1;
        for (int i=1; i<=num1; i++)
        {
            previo = result;
            result *= i;
            if (i > 1) {
                this.debugPrint(previo + " * " + i + " = " + result);
            }
        }
        return result;
    }


    /*
    Funcion segura para pedir un numero al usuario y validarlo
        @param texto (Texto a mostrar ejemplo: Introduce un número:)
    */
    public float pedirNumero (String texto)
    {
        float operation = 0;
        try {
            System.out.print(texto);
            operation = scanner.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Nuevo error encontrado, debe ingresar un número válido "+exception);
            operation = -1;
        }
        return operation;
    }

    /*
    Funcion para calcular si un numero es primo o no
        @param numero (numero a calcula ej: 17)
        @return 1 or 0
    */
    int esPrimo (int numero)
    {
        if (numero <=1) return 0;
        for (int i=2; i<=Math.sqrt(numero); i++)
        {
            if (numero % i == 0) return 0;
        }
        return 1;
    }

    /*
    Funcion que calcula segun el paso en el que estamos del programa
        @param num1 (numero 1 siempre necesario)
        @param num2 (numero 2 a veces no se usa)
        @param step (paso del programa segun el paso un calculo o otro)
    */
    private long calculator(int num1, int num2, int step)
    {
        long result = 0;
        long previo; // uso de long para evitar el fallo al realizar la operacion  259459200 * 14 en el segundo algoritmo

        switch (step){
            case(1):{
                for (int i=num1; i<=num2; i++)
                {
                    previo = result;
                    result += i;
                    if (i > 1) {
                        this.debugPrint(previo + " + " + i + " = " + result);
                    }
                }
                break;
            }
            case(2):{
                result = num1;

                for (int i=num1+1; i<=num2; i++)
                {
                    previo = result;
                    result = result * i;
                    if (i > 1) {
                        this.debugPrint(previo + " X " + i + " = " + result);
                    }
                }
                break;
            }
            case(3):{
                int num = (int) Math.floor(num1 /10);
                result = 1;
                for (int i=1; i<=num; i++)
                {
                    previo = result;
                    result *= i;
                    if (i > 1) {
                        this.debugPrint(previo + " X " + i + " = " + result);
                    }
                }
                return result;
            }
            case(4):{
                return esPrimo(num1);
            }
            case (5): {
                long total = (this.factorial(num1) + this.factorial(num2));
                this.debugPrint("Total: " + total);
                return total;
            }
        }
        return result;
    }

    // Funcion principal para iniciar el juego
    void startGame () {
        System.out.printf(Strings.TEXTS[0]);
        String enter = scanner.nextLine();
        System.out.print("Vamos a empezar a jugar entonces....");
    }

    // Funcion que hace el efecto de cargando...
    void carga () {
        try {
            System.out.println("\nReiniciando sistemas de navegación");
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(700);
            }
            System.out.println();
            Thread.sleep(600);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Funcion para volver a jugar (se crea porque este código se repetiria mucho)
    void jugarDeNuevo()
    {
        scanner.nextLine();
        System.out.println("\n¿Quieres volver a jugar si/no?");
        String enter = scanner.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (enter.toLowerCase().equals("si")) {
            this.main();
        } else {
            System.out.println("Gracias por jugar ");
        }
    }

    /*
    Funcion para ejecutar el paso
        @param textoIndex (Indice de string que tenemos en un objeto a parte para no molestar el código)
        @para min1 (numero mínimo de un random)
        @param max1 (numero máximo de un random)
        @param min2 (numero minimo del random 2)
        @param max2 (numero máximo del random 2)
        A traves de textoIndex calculamos el paso tambien y tambien formateamos la entrada de la funcion
        en caso de no necesitar 2 numeros aleatorios o lo que sea
    */
    boolean ejecutarPaso(int textoIndex, int min1, int max1, int min2, int max2)
    {
        int num1 = random.nextInt(max1 - min1 + 1) + min1;
        int num2 = random.nextInt(max2 - min2 + 1) + min2;

        System.out.println();
        if (textoIndex == 3) {
            System.out.println(String.format(Strings.TEXTS[textoIndex], num1, num1, num1, num1));

        } else {
            System.out.println(String.format(Strings.TEXTS[textoIndex], num1, num2));
        }

        long respuestaCorrecta = this.calculator(num1, num2, textoIndex);
        this.debugPrint(String.valueOf(respuestaCorrecta));

        float entradaRespuesta = this.pedirNumero("Introduce tu respuesta:");

        if (entradaRespuesta == -1) {
            System.out.println("\nError de sintaxis detectado en el sistema de entrada.");
        } else if (entradaRespuesta != respuestaCorrecta) {
            System.out.println("\nCódigo incorrecto introducido.");
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :(\n :(\n Todavía no eres un Maestro Jedi de las Matemáticas.");
        } else {
            return true;
        }

        this.carga();
        this.jugarDeNuevo();
        return false;
    }


    // Funcion principal que ejecuta el juego
    void main() {
        boolean step1, step2 = false, step3 = false, step4 = false, step5 = false;
        this.startGame();
        step1 = this.ejecutarPaso(1, 1, 10, 20, 30);
        if (step1) {
            step2 = this.ejecutarPaso(2, 1, 7, 8, 20);
        }
        if (step2) {
            step3 = this.ejecutarPaso(3, 50, 100, 0, 0);
        }
        if (step3) {
            step4 = this.ejecutarPaso(4, 10, 100, 0, 0);
        }
        if (step4) {
            step5 = this.ejecutarPaso(5, 5, 10, 5, 10);
        }
        if (step1 && step2 && step3 && step4 && step5) {
            System.out.println(this.Strings.TEXTS[6]);
            this.jugarDeNuevo();
        }
    }

}
