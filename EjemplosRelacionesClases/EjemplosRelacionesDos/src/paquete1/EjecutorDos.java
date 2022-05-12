/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombreP;
        String cedula;
        System.out.println("Ingrese el nombre del barrio");
        nombre = entrada.nextLine();
        Barrio b3 = new Barrio(nombre);

        System.out.println("Ingrese el nombre de la Persona");
        nombreP = entrada.nextLine();
        System.out.println("Ingrese la cedula del Usuario");
        cedula = entrada.nextLine();
        Persona pers3 = new Persona(nombreP,cedula,b3);
        System.out.printf("%s\n",pers3);
    }

}
