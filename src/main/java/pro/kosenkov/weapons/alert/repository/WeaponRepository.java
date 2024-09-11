package pro.kosenkov.weapons.alert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.kosenkov.weapons.alert.entity.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, String> {
}
