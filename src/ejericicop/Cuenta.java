
package ejericicop;

public class Cuenta {
    
    public int NumeroDeCuenta = 0;
    public int ClaveDeAcceso = 0;
    public String  Nombre = null; 
    public int saldo = 0;
    
    
    public int consignar(int entrada){
        
        saldo = saldo + entrada ;
    
        
        System.out.println(saldo);
        return saldo;
    }
    
    public int retirar(int salida){
        
      saldo = saldo - salida;
         System.out.println(salida);
        return salida;
    }
    
    
    public int cambiarclave(int nuevaclave){
        
        ClaveDeAcceso = nuevaclave;
         System.out.println(ClaveDeAcceso);
        return ClaveDeAcceso;
    }
    
    
    public int consultarsaldo(){
        
         System.out.println(saldo);
        return saldo;
    }
    
    
       
    
    
}
