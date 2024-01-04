package mx.edu.utez.springE.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@jakarta.persistence.Entity
@Builder
@Table(name = "usuario")

public class UsuarioBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer id_person;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "curp")
    private String curp;
    @Column(name = "fecha_de_nacimiento")
    private String fecha_de_nacimiento;


}
