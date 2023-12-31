package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
        
        Usuario usu = new Usuario();
        
        usu.setNombre_usuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        controladoraPersistencia.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
        return controladoraPersistencia.getUsuarios();
    }
}
