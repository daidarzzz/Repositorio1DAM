package org.example.TEMA5.Insti;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

    public Estudiante (@NonNull String nombre) {
        this.nombre = nombre;
    }

}
