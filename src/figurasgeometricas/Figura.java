/*
 */
package figurasgeometricas;

/**
 *
 */
public class Figura {
 protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
   public double calcularArea()
   {
       return 0.0;
   }
   
    public boolean isRegular()
   {
       return false;
   }
 
}
