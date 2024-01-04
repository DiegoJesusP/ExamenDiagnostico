package mx.edu.utez.springE.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UsuarioDto {
    private Integer id_person;
    private String nombres;
    private String apellidos;
    private String curp;
    private String fecha_de_nacimiento;
}
