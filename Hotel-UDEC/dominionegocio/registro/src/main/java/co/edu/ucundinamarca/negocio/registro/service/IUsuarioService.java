package co.edu.ucundinamarca.negocio.registro.service;
import co.edu.ucundinamarca.negocio.registro.model.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> findAll();
    public Usuario guardar(Usuario usuario);
    public Usuario find(Long id_usuario);
}
