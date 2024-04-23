package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
     /**
    * Complejidad lineal: O(N) - Tiempo lineal.
     * @param args
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese el genero del libro:");
        String genero = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = sc.nextInt();
      
       Libro libro = new Libro (titulo,autor,anoPublicacion,genero);
               libro.marcarLeido();

        System.out.println(libro.mostrarInformacion());
        System.out.println("¿El libro ha sido leído? " + (libro.getLeido() ? "Sí" : "No"));
        System.out.println("¿El libro es antiguo? " + (libro.esAntiguo() ? "Sí" : "No"));

        sc.close();
    }
}
