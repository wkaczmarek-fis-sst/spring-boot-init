package pl.fissst.hibernatesearch.application;

import org.springframework.stereotype.Service;
import pl.fissst.hibernatesearch.domain.Person;
import pl.fissst.hibernatesearch.domain.PersonRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person findById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
