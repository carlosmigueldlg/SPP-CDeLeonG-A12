/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a12;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author CarlosMiguel
 */
public class SPPCDeLeonGA12 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        inicio();
        double l,imc;
        int p;
        p=solPeso();
        l=solEstatura();
        imc= p / Math.pow(l, 2);
        if(imc<18.5){
                JOptionPane.showMessageDialog(null, " Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null," Consulte un doctor");
        }
        if(imc>=18.5 && imc<=25){
                JOptionPane.showMessageDialog(null, "Su IMC es de "+imc);
                JOptionPane.showMessageDialog(null," Saludable ");
        }
        if(imc>25){
                JOptionPane.showMessageDialog(null, " Su IMC es "+imc);
                JOptionPane.showMessageDialog(null," Usted está pasado de peso");
        }
    }
   
    
    public static void inicio(){
        JOptionPane.showMessageDialog(null, " Calculadora de IMC");
    }



    public static int solPeso(){
        JFrame frame = new JFrame();
        int peso=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Porfavor ingrese su peso en kg: ");
                peso =Integer.parseInt(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, "Porfavor intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
                flag=true;
            }
        }while(flag==true);
        return peso;
    }
    
    
    public static double solEstatura(){
        JFrame frame = new JFrame();
        double e=0;
        boolean flag;
        do{        
            try{
                String entrada = JOptionPane.showInputDialog(null, "Porfavor ingrese su estatura en metros: ");
                e =Double.parseDouble(entrada);
                flag=false;
            }catch(Exception ex){
                JOptionPane.showMessageDialog(frame, " Porfavor intente de nuevo", " Error ", 
                                        JOptionPane.ERROR_MESSAGE);
        flag=true;
            }
        }while(flag==true);
        return e;
    }
}
        