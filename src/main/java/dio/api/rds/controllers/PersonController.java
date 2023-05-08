package dio.api.rds.controllers;

import dio.api.rds.entitys.Person;
import dio.api.rds.repositorys.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Person> consultAllPerson() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> consultById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
