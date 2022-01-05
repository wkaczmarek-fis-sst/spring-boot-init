package pl.fissst.hibernatesearch.presentation.rest.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthdate;

}
