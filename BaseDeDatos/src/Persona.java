
/**
 *
 * @author Juan Dario
 */
public class Persona {
    
    private String Nombre,Apellido;
    private int ID, Telf;

    public Persona(String Nombre, String Apellido, int ID) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Telf = Telf;
        
    }

    Persona() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getTelf() {
        return Telf;
    }

    public void setTelf(int Telf) {
        this.Telf = Telf;
    }
    
   @Override
   public String toString(){
       return "El nombre de la persona es: "+Nombre +" "+Apellido;
   }
    
}

