package pro.kosenkov.weapons.alert.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Entity
@Table(name = "weapons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Weapon implements Serializable {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "version")
    private String version;

    @Column(name = "description")
    private String description;
}
