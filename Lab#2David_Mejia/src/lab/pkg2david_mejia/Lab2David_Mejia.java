/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2david_mejia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadina Mazzoni
 */
public class Lab2David_Mejia {
    static Scanner r=new Scanner(System.in);
    static ArrayList casas=new ArrayList();
    static ArrayList construccion=new ArrayList();
    static ArrayList listas=new ArrayList();
    static ArrayList cont_espera=new ArrayList();
    static ArrayList demolicion=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese su nombre de usuario: ");
        String nombre1=r.next();
        System.out.println("Ingrese su contraseña: ");
        int contraseña=r.nextInt();
        while (nombre1.equals("leobanegas")==false || contraseña!=99)
        {
            System.out.println("Usuario y/o contraseña incorrectos, ingreselos nuevamente: ");
            System.out.println("Ingrese su nombre de usuario: ");
            nombre1=r.next();
            System.out.println("Ingrese su contraseña: ");
            contraseña=r.nextInt();
        }
        System.out.println(" ");
        System.out.println("Bienvenido Leo Banegas.\nPor favor, ingrese una opcion: ");
        int opcion=0;
        while (opcion!=3)
        {
            System.out.println(" ");
            System.out.println("-- MENU PRINCIPAL --");
            System.out.println("1) Registro de casas: ");
            System.out.println("2) Manejo de estados: ");
            System.out.println("3) Sair");
            opcion=r.nextInt();
            while (opcion<1 || opcion>3)
            {
                System.out.println("Por favor, ingrese una opcion valida: ");
                opcion=r.nextInt();
            }
            int opcion2=0;
            if (opcion==1)
            {
                    System.out.println(" ");
                    System.out.println("Ingreso a la opcion Registro de casas\n¿Que desea hacer? ");
                    System.out.println("1) Crear casas");
                    System.out.println("2) Listar casas");
                    System.out.println("3) Modificar casas");
                    System.out.println("4) Borrar casas");
                    opcion2=r.nextInt();
                    while (opcion2<1 || opcion2>4)
                    {
                        System.out.println("Ingrese una opcion correcta:  ");
                        opcion2=r.nextInt();
                    }
                    System.out.println(" ");
                if (opcion2==1)
                {
                    Registro();
                }
                if (opcion2==2)
                {
                    System.out.println(" ");
                    Print();
                }
                if (opcion2==3)
                {
                     System.out.println(" ");
                     Modificar();    
                }
                if (opcion2==4)
                {
                    System.out.println(" ");
                    Eliminar();
                }
            }
            if (opcion==2)
            {
                
                PorCategoria();
                    System.out.println(" ");
                    System.out.println("Ingrese la categorria de estado que desea modificar: ");
                    System.out.println("1) Casas en Construccion: ");
                    System.out.println("2) Casas listas: ");
                    System.out.println("3) Casas en construcion en espera: ");
                    System.out.println("4) Casas en espera de demolicion: ");
                    int op=r.nextInt();
                    while (op<1 || op>4)
                    {
                        System.out.println("Ingrese una opcion valida: ");
                        op=r.nextInt();
                    }
                    switch(op)
                    {
                        case 1: System.out.println("");
                            System.out.println("-- CASAS EN CONSTRUCCION --");
                            PrintArray(construccion);
                            break;
                        case 2: System.out.println(" ");
                            System.out.println("-- CASAS LISTAS --");
                            PrintArray(listas);
                            System.out.println(" ");
                            break;
                        case 3: System.out.println(" ");
                            System.out.println("-- CONSTRUCCION EN ESPERA --");
                            PrintArray(cont_espera);
                            System.out.println(" ");
                        case 4: System.out.println(" ");
                            System.out.println(" -- DEMOLICION --");
                            PrintArray(demolicion);
                            System.out.println(" ");
                             
                    }
               
            }
        }
            
    }
    
    public static void Registro()
    {
        System.out.println(" ");
                    System.out.println("Ingrese el numero de casa: ");
                    int numero=r.nextInt();
                    System.out.println("Ingrese el numero de bloque: ");
                    int bloque=r.nextInt();
                    System.out.println("Ingrese el color de la casa: ");
                    String color=r.next();
                    System.out.println("Ingrese el ancho de la casa [metros]: ");
                    double ancho=r.nextDouble();
                    System.out.println("Ingrese el largo de la casa [metros]: ");
                    double largo=r.nextDouble();
                    System.out.println("¿Ya fue comprada? [Si o No]: ");
                    String comprada=r.next();
                    String nombre="--";
                    if (comprada.equalsIgnoreCase("si"))
                    {
                        System.out.println("Ingrese el nombre del dueño: ");
                        r.nextLine();
                        nombre=r.nextLine();
                    }   
                        System.out.println("Ingrese el numero de pisos: ");
                        int pisos=r.nextInt();
                        System.out.println("Ingrese el numero de baños: ");
                        int baños=r.nextInt();
                        System.out.println("Ingrese el numero de cuartos: ");
                        int cuartos=r.nextInt();
                        System.out.println("Ingrese el estado de la casa (lista , construccion, construccion en espera, espera de demolicion): ");
                        r.nextLine();
                        String estado=r.nextLine();
                        System.out.println("Ingrese el nombre del ingeniero a cargo: ");
                        String ingeniero=r.nextLine();
                        casas.add(new Casas(numero, bloque, color, ancho, largo, comprada, nombre, pisos, baños, cuartos, estado, ingeniero));
                        System.out.println(" ");
                        System.out.println("Casa añadida exitosamente"); 
                    
    }
    
    public static void Print()
    {
        for(Object t:casas)
        {
            System.out.println(casas.indexOf(t)+") ");
            System.out.println(t);
            System.out.println(" ");
        } 
    }
    
    public static void Modificar()
    {
        System.out.println("TODAS LAS CASAS EN EL SISTEMA: ");
        Print();
        System.out.println("Seleccione el subindice de la casa que quiere modificar: ");
        int subindice=r.nextInt();
        while (subindice>casas.size()-1 || subindice<0)
        {
            System.out.println("La casa en el subindice especificado, no existe, ingreselo nuevamente: ");
            subindice=r.nextInt();
        }
        System.out.println("Ingrese el numero de la casa: ");
        int numero=r.nextInt();
        System.out.println("Ingrese el numero de bloque: ");
        int bloque=r.nextInt();
        System.out.println("Ingrese el color de la casa: ");
        String color=r.next();
        System.out.println("Ingrese el ancho de la casa: ");
        double ancho=r.nextDouble();
        System.out.println("Ingrese el largo: ");
        double largo=r.nextDouble();
        System.out.println("¿Ya fue comprada? [Si o No]: ");
        String comprada=r.next();
        String nombre="--";
        if (comprada.equalsIgnoreCase("si"))
        {
            System.out.println("Ingrese el nombre del dueño: ");
            r.nextLine();
            nombre=r.nextLine();
        }   
            System.out.println("Ingrese el numero de pisos: ");
            int pisos=r.nextInt();
            System.out.println("Ingrese el numero de baños: ");
            int baños=r.nextInt();
            System.out.println("Ingrese el numero de cuartos: ");
            int cuartos=r.nextInt();
            System.out.println("Ingrese el nombre del ingeniero a cargo: ");
            r.nextLine();
            String ingeniero=r.nextLine();
            ((Casas)casas.get(subindice)).setNumerocasa(numero);
            ((Casas)casas.get(subindice)).setBloque(bloque);
            ((Casas)casas.get(subindice)).setColor(color);
            ((Casas)casas.get(subindice)).setAncho(ancho);
            ((Casas)casas.get(subindice)).setLargo(largo);
            ((Casas)casas.get(subindice)).setComprada(comprada);
            ((Casas)casas.get(subindice)).setNombre(nombre);
            ((Casas)casas.get(subindice)).setPisos(pisos);
            ((Casas)casas.get(subindice)).setBaños(baños);
            ((Casas)casas.get(subindice)).setCuartos(cuartos);
            ((Casas)casas.get(subindice)).setIngeniero(ingeniero);
            System.out.println(" ");
            System.out.println("Casa modificada exitosamente"); 
        
    }
    
    public static void Eliminar()
    {
        System.out.println("Ingrese el subindice de la casa que quiere modificar: ");
        int subindice=r.nextInt();
        while (subindice<0 || subindice>casas.size()-1)
        {
            System.out.println(" ");
            System.out.println("El subindice de la casa que ingreso no existe, ingreselo nuevamente: ");
            subindice=r.nextInt();
        }
        casas.remove(subindice);
        System.out.println(" ");
        System.out.println("Casa eliminada exitosamente ");
    }
    
    public static void PorCategoria()
    {
        System.out.println(" ");
        System.out.println("-- CASAS EN CONSTRUCCION -- ");

        for (int i=0; i<casas.size();i++)
        {
           if(((Casas)casas.get(i)).getEstado().equalsIgnoreCase("en construccion"))
           {
               construccion.add(casas.get(i));
           }  
        }
        System.out.println(" ");
        System.out.println("-- CASAS LISTAS--");
        for (int i=0; i<casas.size();i++)
        {
           if(((Casas)casas.get(i)).getEstado().equalsIgnoreCase("listas"))
           {
               System.out.println(casas.indexOf(i)+") "+casas.get(i));
               listas.add(casas.get(i));
           }  
        }
        System.out.println(" ");
        System.out.println("-- CASAS CON CONSTRUCCION EN ESPERA  --");
        for (int i=0; i<casas.size();i++)
        {
           if(((Casas)casas.get(i)).getEstado().equalsIgnoreCase("construccion en espera"))
           {
               cont_espera.add(casas.get(i));
           }  
        }
        System.out.println(" ");
        System.out.println("-- ESPERA DE DEMOLICION --");
        for (int i=0; i<casas.size();i++)
        {
           if(((Casas)casas.get(i)).getEstado().equalsIgnoreCase("espera de demolicion"))
           {
               demolicion.add(i);
           }  
        }
                
                
               
    }
    
    public static void PrintArray(ArrayList x)
    {
        for (Object t: x)
        {
            System.out.println("Subindice de la casa "+x.indexOf(t)+") \n"+t);
        }
    }
}
