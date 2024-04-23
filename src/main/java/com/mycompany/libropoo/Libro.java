package com.mycompany.libropoo;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion; 
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int anoPublicacion, boolean leido,String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.leido = leido;
        this.genero= genero;
    }

   
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     * @return 
     */
    public String mostrarInformacion() {
        return ( "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " 
               + anoPublicacion+ ", Leído: " + (leido? "Sí" : "No"));
       
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void marcarLeido() {
        this.leido= true;
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     * @return 
     */
    public boolean getLeido(){
        return leido;
    }
    
    /**
     * Complejidad temporal: O(1) - Tiempo constante.
     * @return 
     */
    public boolean esAntiguo() {
        if (anoPublicacion>=1974){
            return false;
        } else {
            return true;
        }
    }
    
}
