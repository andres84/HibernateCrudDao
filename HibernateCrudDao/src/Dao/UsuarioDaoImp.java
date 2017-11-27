package Dao;

import model.Usuario;
import Util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDaoImp implements UsuarioDaoInterface{

    private final Session sesion = HibernateUtil.getSesion();
    
    @Override
    public void crear(Usuario usuario) {
        
            
            sesion.beginTransaction();
            sesion.save(usuario);
            sesion.getTransaction().commit();
    
    }

    @Override
    public void modificar(Usuario usuario) {
        
            sesion.beginTransaction();
            sesion.update(usuario);
            sesion.getTransaction().commit();
    
    }

    @Override
    public void eliminar(Usuario usuario) {
        
        sesion.beginTransaction();
        sesion.delete(usuario);
        sesion.getTransaction().commit();
    
    }

    @Override
    public List<Usuario> listarUsuario() {
        
        Query l = sesion.createQuery("FROM Usuario");
        
        return (List<Usuario>) l.list();
    
    }
    
}
