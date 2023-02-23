
package cuentas;

public class Cuentas {
    
    int saldo;

    public Cuentas(int saldo) {
        this.saldo = saldo;
    }
    


public void abonar(int saldo){

    this.saldo += saldo;

}
public void debitar(int saldo){

this.saldo -= saldo;
}

public int mostrar(){

    return this.saldo;

}
       
}
    

