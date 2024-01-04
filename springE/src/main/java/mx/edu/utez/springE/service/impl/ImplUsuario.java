package mx.edu.utez.springE.service.impl;

import jakarta.transaction.Transactional;
import mx.edu.utez.springE.model.dao.UsuarioDao;
import mx.edu.utez.springE.model.dto.UsuarioDto;
import mx.edu.utez.springE.model.entity.UsuarioBean;
import mx.edu.utez.springE.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplUsuario implements IUsuario {

    @Autowired
    private UsuarioDao usuarioDao;
/*
private Integer id_person;
    private String nombres;
    private String apellidos;
    private String curp;
    private String fecha_de_nacimiento;
 */
    @Override
    @Transactional
    public UsuarioBean save(UsuarioDto usuarioDto) {
            UsuarioBean usuario = UsuarioBean.builder()
                .id_person(usuarioDto.getId_person())
                    .nombres(usuarioDto.getNombres())
                    .apellidos(usuarioDto.getApellidos())
                    .curp(usuarioDto.getCurp())
                    .fecha_de_nacimiento(usuarioDto.getFecha_de_nacimiento())
                .build();
        return usuarioDao.save(usuario);
    }

    //(readOnly = true)
    @Override
    @Transactional
    public UsuarioBean findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    //(readOnly = true)
    @Override
    @Transactional
    public List<UsuarioBean> findAll() {
        return (List<UsuarioBean>) usuarioDao.findAll();
    }

    @Override
    public void delete(UsuarioBean usuario) {
        usuarioDao.delete(usuario);
    }
}
