package pro.kosenkov.weapons.alert.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.weapons.alert.entity.Person;
import pro.kosenkov.weapons.alert.repository.PersonRepository;

import java.util.List;

@RequestMapping("api/v1/persons")
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository repository;

    @GetMapping
    public List<Person> getAllPersons() {
        return repository.findAll();
    }
}
