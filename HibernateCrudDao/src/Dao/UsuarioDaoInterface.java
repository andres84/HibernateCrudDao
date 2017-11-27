package Dao;

import model.Usuario;
import java.util.List;

public interface UsuarioDaoInterface {

    public void crear(Usuario usuario);
    
    public void modificar(Usuario usuario);

    public void eliminar(Usuario usuario);
    
    public List<Usuario> listarUsuario();
    
}
