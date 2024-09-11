package pro.kosenkov.weapons.alert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.weapons.alert.entity.Weapon;
import pro.kosenkov.weapons.alert.repository.WeaponRepository;

import java.util.List;

@RequestMapping("api/v1/weapons")
@RestController
@RequiredArgsConstructor
public class WeaponController {

    private final WeaponRepository repository;

    @GetMapping
    public List<Weapon> getAllProducts() {
        return repository.findAll();
    }
}
