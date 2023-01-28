import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
/**
 *
 * @author Juan Dario
 */
public class Conexion {
   private  ObjectContainer db;
   
   private void open(){
       //Creacion de la base de datos "Entre parentesisel nombre.yap"
       this.db=Db4o.openFile("Clientes.yap");
   }
}