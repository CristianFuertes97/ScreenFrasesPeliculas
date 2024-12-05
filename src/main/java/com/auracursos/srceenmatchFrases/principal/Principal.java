package com.auracursos.srceenmatchFrases.principal;

import com.auracursos.srceenmatchFrases.modelos.Frase;
import com.auracursos.srceenmatchFrases.repository.FraseRepository;

import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    private FraseRepository repository;

    public Principal(FraseRepository repository) {
    }

    public void mostrarMenu(){
        System.out.println("*****Frases de Peliculas****");
        while (true){
            System.out.println("Desea ingresar una nueva frase (S/N)");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("s")){
                System.out.println("Ingrese el titulo de la pelicula");
                var titulo = sc.nextLine();
                System.out.println("Ingrese la frase de la pelicula");
                var frase = sc.nextLine();
                System.out.println("ingrese nombre del personaje que dice la frase");
                var personaje = sc.nextLine();
                Frase frases = new Frase(titulo,frase,personaje);
                agregarFrase(frases);
            }else{
                System.out.println("Cerrando el sistema....");
                break;
            }

        }
    }

    public Frase agregarFrase(Frase frase){
        return repository.save(frase);
    }
}
