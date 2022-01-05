package pl.fissst.hibernatesearch.presentation.rest.model;

import org.mapstruct.Mapper;
import pl.fissst.hibernatesearch.domain.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonDto toPersonDto(Person p);

}
