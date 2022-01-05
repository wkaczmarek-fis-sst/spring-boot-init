package pl.fissst.hibernatesearch.presentation.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fissst.hibernatesearch.application.PersonService;
import pl.fissst.hibernatesearch.presentation.rest.model.PersonDto;
import pl.fissst.hibernatesearch.presentation.rest.model.PersonMapper;

@RestController
@RequestMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class PersonRestController {

    private final PersonService personService;
    private final PersonMapper mapper;

    public PersonRestController(PersonService personService, PersonMapper mapper) {
        this.personService = personService;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public PersonDto getPerson(@PathVariable("id") Long id) {
        var person = personService.findById(id);
        return mapper.toPersonDto(person);
    }

}
