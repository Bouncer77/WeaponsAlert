package pro.kosenkov.weapons.alert.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Entity
@Table(name = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Person implements Serializable {

    @Id
    @Column(name = "uuid")
    @GeneratedValue
    private String uuid;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;
}
