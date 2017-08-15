
package ejericicop;


public class Ejericicop {

    
    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta ();
        
            c1.Nombre = "MagdalenaSanchez";
            c1.ClaveDeAcceso = 1234 ;
            c1.NumeroDeCuenta = 1012;
            c1.saldo = 0;
            
            
        Cuenta c2 = new Cuenta ();
        
            c2.Nombre = "JoselitoPerez";
            c2.ClaveDeAcceso = 9876 ;
            c2.NumeroDeCuenta = 1013;
            c2.saldo = 500000;
            
    c1.consignar(100000);
    
    c2.cambiarclave(1234);
    
    c2.consultarsaldo();
    
    
    
    }
    
   
 }
    

