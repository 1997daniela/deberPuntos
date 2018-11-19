/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;
import static ec.edu.ister.modelo.Operaciones.coorX;
import static java.sql.DriverManager.println;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Flores
 */
public class Operaciones {
    private int n1,n2, n3;
    public Operaciones(){
}
    public Operaciones (int n1, int n2 , int n3){
        this.n1 =n1;
        this.n2= n2;
        this.n3= n3;
  
    }
    public static void coorX(){
        String   x; 
Scanner coorX=new Scanner(System.in);  
System.out.println("Ingrese su punto en Y ");
x=  coorX. nextLine();
System.out.println("Su coordenada en Y es "+ x);
    }
    public static void coorY(){                 
        String   y; 
Scanner coorY=new Scanner(System.in);  
System.out.println("Ingrese su punto en Y ");
y=  coorY. nextLine();
System.out.println("Su coordenada en Y es "+ y);
} 
    public static void coorZ(){
        String   z; 
Scanner coorZ=new Scanner(System.in);  
System.out.println("Ingrese su punto en z ");
z=  coorZ.nextLine();
System.out.println("Su coordenada en z es "+ z);
        
    }
    }
    
 