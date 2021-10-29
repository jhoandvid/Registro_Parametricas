package co.edu.ucundinamarca.negocio.registro.service;

import co.edu.ucundinamarca.negocio.registro.model.Rol;
import co.edu.ucundinamarca.negocio.registro.model.Usuario;

import java.util.List;

public interface IRolService {

    public List<Rol> findAll();
    public Rol guardar(Rol rol);
    public Rol find(Long id_rol);
}
