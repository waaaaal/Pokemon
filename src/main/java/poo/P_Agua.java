
package poo;


public class P_Agua extends Pokemon {

    public P_Agua(int ph, int fuerza, boolean estado) {
        
//super.setPh(ph); esto reemplaza a lo otro.
        //esto simplica el this.ph =ph , this.fuerza = fuerza
        super(ph, fuerza, estado, Tipo.AGUA);
    }
    
    
    
    
}
