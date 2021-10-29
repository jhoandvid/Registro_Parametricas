package co.edu.ucundinamarca.negocio.registro.service;
import co.edu.ucundinamarca.negocio.registro.model.Usuario;
import co.edu.ucundinamarca.negocio.registro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario find(Long id_persona) {
        return usuarioRepository.findById(id_persona).orElse(null);
    }
}
