/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarraganc.p3.p2;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author
 * José Eduardo De Llano Barragán   A01410712   IC
 * Alberto Barnetche Suarez         A01411570   ISS
 * Carlos Barragán Carrión          A01410357   IMT
 * Carlos Miguel De León García     A01410399   IMA
 * 
 */

public class SPPCBarraganCP3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arreglo();
    }
    public static int solicitacionEntero(String mensaje){
     
        int x = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            x = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return x;
    }
    public static double solicitacionDouble(String mensaje){
     
        JFrame frame = new JFrame();
        double dato=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, mensaje);
                dato =Double.parseDouble(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
        }while(flag==true);
        return dato;
    }
    public static void Arreglo(){
        double suma=0;
        int x=solicitacionEntero ("¿Cuántos gastos realizó?"),i=0;
        double [] arreglo = new double [x];
        String [] productos= new String[x];
        for(int p=0;p<productos.length;p++){
            productos[p]=JOptionPane.showInputDialog(null,"Intoduzca el producto/gasto");
            if(i==p){
            arreglo[i]= solicitacionDouble("Introduzca el gasto de: "+productos[p]);
                    if(arreglo[i]<0){
                        JOptionPane.showMessageDialog(null, "Lo sentimos ese valor no es válido");
                        JOptionPane.showMessageDialog (null, "El total de gastos es: " + suma);
                        System.exit(0);
                    }else
                suma = (suma + arreglo[i]);
                i++;

            }
        }
        JOptionPane.showMessageDialog (null, "El total de gastos es: " + suma);
        System.exit(0);
    }
}