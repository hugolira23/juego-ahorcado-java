package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        //Clase scanner
        Scanner scanner = new Scanner(System.in);
        //Declaraciones y Asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //Estructura de control de tipo iterativa (bucle)
        for(int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }
        //Estructura de control de tipo iterativa (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar:" +String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor");

            //usamos clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0)); //charAt 0 solo te devuelve la primer letra
            boolean letraCorrecta = false;

            //Estrucutra de control : Iterativa (bucle)
            for (int i = 0; i < palabraSecreta.length(); i++){

                //Estrcutura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta =true;
                }

            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! Te quedan" + (intentosMaximos - intentos) + "intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡Felicidades adivinaste la palabra secreta: " +palabraSecreta);
            }

        }
        if (palabraAdivinada) {
            System.out.println("¡Que pena te has quedado sin intentos!");

        }
        scanner.close();
    }
}