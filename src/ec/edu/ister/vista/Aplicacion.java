/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.du.ister.controlador.Coordinador;

/**
 *
 * @author Flores
 */
public class Aplicacion {
    public static void main(String[] args){
      // Operaciones objeto= new Operaciones();
      // Operaciones.suma();
       //JOptionPane.showMessageDialog(null,Operaciones.resta());
       //objeto.division();
       //JOptionPane.showMessageDialog(null,division());    
       Coordinador objeto=new Coordinador();
       objeto.menuScanner();   
       
}
}
