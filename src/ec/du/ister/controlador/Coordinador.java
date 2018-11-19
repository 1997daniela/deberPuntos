/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.du.ister.controlador;

import ec.edu.ister.modelo.Operaciones;
import java.util.Scanner;

/**
 *
 * @author Flores
 */
public class Coordinador {
    Scanner entrada =new Scanner(System.in);
   public  void opcionesmenu(){
       System.out.println("Ingresa una  opcion"
               + "1.- Ingresar Coordenada X \n"
                + "2.- Ingresa coordenada Y \n"
                +"3.-Ingrese coordenada \n "
               + "4.-Salir \n");
   }
   public void menuScanner(){
       int op=0;
       do{
       opcionesmenu();
       op=entrada.nextInt();
       switch (op){
           case 1:
        Operaciones.coorX();
               break;
           case 2:
            Operaciones.coorY();
           case 3:
           Operaciones.coorZ();
       }
       
   }while(op!=4);

    }

    
}
