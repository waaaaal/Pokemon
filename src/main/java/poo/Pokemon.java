
package poo;


public class Pokemon implements I_Acciones {
  
   private int ph;
   private int fuerza;
   private boolean estado; //estaod vivo o muerto si 0 o < cambia de estado a off
   private Tipo tipo_pokemon;
   
   
   

    public Pokemon(int ph, int fuerza, boolean estado, Tipo tipo_pokemon) {
        this.ph = ph;
        this.fuerza = fuerza;
        this.estado = estado;
        this.tipo_pokemon = tipo_pokemon;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Tipo getTipo_pokemon() {
        return tipo_pokemon;
    }

    public void setTipo_pokemon(Tipo tipo_pokemon) {
        this.tipo_pokemon = tipo_pokemon;
    }
    
   
      
    
    
    
    
    @Override
    public void atacar(Pokemon px) {
        
      px.setPh(-10);
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cambiar() {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
