
package cuentas;

import java.util.Scanner;

public class abonos {
    
    public static void main(String[] args) {
        
        Cuentas cuenta1 = new Cuentas(0);
        Cuentas cuenta2 = new Cuentas(0);
        
        while (true) {   
            
            Scanner sp = new Scanner(System.in);
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1.Abonar");
            System.out.println("2.Debitar");
            System.out.println("3.Mostrar");
            System.out.println("4.Salir");
            
            int Menu = sp.nextInt();
            
            switch(Menu){
                
                case 1:
                    
                    System.out.println("A que cuenta desea abonar: ");
                    int nocuenta = sp.nextInt();
                    if(nocuenta == 1){
                        System.out.println("Ingrese el monto que desea abonar");
                        int sumar = sp.nextInt();
                    
                        cuenta1.saldo = sumar + cuenta1.saldo;
                    
                        System.out.println("Su nuevo saldo bancario es " + cuenta1.mostrar()); 
                    }
                        else if(nocuenta == 2){
                            
                            System.out.println("Ingrese el monto que desea abonar");
                            int sumar = sp.nextInt();
                    
                            cuenta2.saldo = sumar + cuenta2.saldo;
                    
                            System.out.println("Su nuevo saldo bancario es " + cuenta2.mostrar()); 

                                }
                                else{
                            System.out.println("Esa cuenta no existe. Intente otra vez.");
                                
                                }
                    
                    break;
                    
                case 2:
                    System.out.println("A que cuenta quiere debitar? 1 o 2");
                    int ncuenta = sp.nextInt();
                    
                    if (ncuenta == 1){
                            
                    System.out.println("Ingrese el monto a debitar:");
                    int resta = sp.nextInt();
                        if (cuenta1.saldo < resta) {
                            
                            System.out.println("Saldo insuficiente");  
                            System.exit(0);
                        }
                        
                    cuenta1.saldo = cuenta1.saldo-resta;
                    
                    System.out.println("Su nuevo saldo bancario es " + cuenta1.mostrar());
                    
                    }
                    else if(ncuenta == 2){
                    
                    System.out.println("Ingrese el monto a debitar? 1 o 2");
                    int resta = sp.nextInt();
                        if (cuenta2.saldo < resta) {
                            
                            System.out.println("Saldo insuficiente");  
                            System.exit(0);
                        }
                    cuenta2.saldo = resta - cuenta2.saldo;
                    
                    System.out.println("Su nuevo saldo bancario es " + cuenta2.mostrar());
                    }
                    else{
                            System.out.println("Esa cuenta no existe. Intente otra vez.");
                                
                                }
                     break;  
                     
                case 3:
                    
                    System.out.println("El Saldo de la cuenta 1 es "+ cuenta1.mostrar());
                    System.out.println("El Saldo de la cuenta 2 es "+ cuenta2.mostrar());
                    break;
                    
                case 4:
                    System.out.println("Vuelva pronto :D ");
                    System.exit(0);
                     break; 
            
            }
            
        }
        
    }
}