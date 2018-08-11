/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author alba
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double saldo_cliente= 0;
        int opcion = 0;
        //permitir leer la engrada por consola 
        Scanner entrada = new Scanner(System.in);
      do{
        System.out.println("Menu");
        System.out.println("0- salir");
        System.out.println("1- consultar");
        System.out.println("2- depositar");
        System.out.println("3- Retirar");
        //capturar la entrada por consula, en este caso 
        //lee un entero}
           opcion = entrada.nextInt();
           switch(opcion){
               case 0:
                   //realiza la acccion
                   System.out.println ("Hasta luego");
                   break; // aqui termina el caso 0
                   case 1:
                       //consultar saldo
                       System.out.println("Tu saldo es de:" + saldo_cliente);
                   //realiza la acccion
                   break; // aqui termina el caso 0
                   case 2:     
                       //deposita el saldo
                       System.out.println("Ingresa la contidad depositada");
                       double deposito = entrada.nextDouble();
                       saldo_cliente = saldo_cliente + deposito;
                  //realiza la acccion
                   break; // aqui termina el caso 0
                   case 3:
                       //retirar saldo
                       System.out.println("Ingresa la contidad retirada");
                       double retiro =entrada.nextDouble();
                 
                       if(retiro<=saldo_cliente){
                          saldo_cliente = saldo_cliente - retiro;
                       }else { 
                           System.out.println("No cuenta con saldo");
                       }
                           //realiza la acccion
                   break; // aqui termina el caso 0
                   default:
                       //si la opcion no cumple ninguna
                       //de las condiciones anteriores 
                       break; //aqui termina el default
                   
           }
           
     }while (opcion != 0);
        
        
    }
    
}
