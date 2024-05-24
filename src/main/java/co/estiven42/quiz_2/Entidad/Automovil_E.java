package co.estiven42.quiz_2.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Automovil")
public class Automovil_E
{
    @Id
    @Column(name = "placa")
    String placa;

    @Column(name = "marca")
    String marca;

    @Column(name = "color")
    String color;

    @Column(name = "nombre_del_auto")
    String nombre_del_auto;


}
