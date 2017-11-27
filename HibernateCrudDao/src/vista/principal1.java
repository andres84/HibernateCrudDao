package vista;

import Dao.UsuarioDaoImp;
import model.Usuario;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

public class principal1 {

    public static void main(String[] args) {

        //CREAR------
        //Usuario usuario = new Usuario();
        //usuario.setIdUsuario(1);
        //usuario.setNombre("Andres");
        //usuario.setApellido("Fragozo");
        //usuario.setEdad(33);
        //UsuarioDaoImp persistencia = new UsuarioDaoImp();
        //persistencia.crear(usuario);
        
        //ELIMINAR-----
        //Session sesion = HibernateUtil.getSesion();
        //Usuario eliminar = (Usuario) sesion.load(Usuario.class, 1);
        //UsuarioDaoImp delete = new UsuarioDaoImp();
        //delete.eliminar(eliminar);
        
        //MODIFICAR-----
        //Session sesion = HibernateUtil.getSesion();
        //Usuario modificar = (Usuario) sesion.load(Usuario.class, 2);
        //UsuarioDaoImp imp = new UsuarioDaoImp();
        //modificar.setApellido("Fragozo Cantor");
        //imp.modificar(modificar);
        
        //LISTAR
        UsuarioDaoImp listar = new UsuarioDaoImp();
        List<Usuario> l = listar.listarUsuario();
        System.out.println("LISTA DE USUARIOS");
        for (Usuario u : l) {
            
            System.out.println("------------------------");
            System.out.println("Nombre: " + u.getNombre());
            System.out.println("Apellido: " + u.getApellido());
            System.out.println("Edad: " + u.getEdad());
        }

    }

}
