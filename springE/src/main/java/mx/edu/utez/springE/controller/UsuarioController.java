package mx.edu.utez.springE.controller;

import mx.edu.utez.springE.model.dao.UsuarioDao;
import mx.edu.utez.springE.model.dto.UsuarioDto;
import mx.edu.utez.springE.model.entity.UsuarioBean;
import mx.edu.utez.springE.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {

    @Autowired
    private IUsuario usuarioService;

    @GetMapping("/")
    public List<UsuarioBean> getUsuario() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public UsuarioBean showById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }
    /*
private Integer id_person;
    private String nombres;
    private String apellidos;
    private String curp;
    private String fecha_de_nacimiento;
     */
    @PostMapping("/")
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {
        UsuarioBean usuarioSave = usuarioService.save(usuarioDto);
        return UsuarioDto.builder()
                .id_person(usuarioDto.getId_person())
                .nombres(usuarioDto.getNombres())
                .apellidos(usuarioDto.getApellidos())
                .curp(usuarioDto.getCurp())
                .fecha_de_nacimiento(usuarioDto.getFecha_de_nacimiento())
                .build();
    }

    @PutMapping("/")
    public UsuarioDto update(@RequestBody UsuarioDto usuarioDto) {
        UsuarioBean usuarioUpdate = usuarioService.save(usuarioDto);
        return UsuarioDto.builder()
                .id_person(usuarioDto.getId_person())
                .nombres(usuarioDto.getNombres())
                .apellidos(usuarioDto.getApellidos())
                .curp(usuarioDto.getCurp())
                .fecha_de_nacimiento(usuarioDto.getFecha_de_nacimiento())
                .build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        UsuarioBean usuario = usuarioService.findById(id);
        usuarioService.delete(usuario);
    }

}
