package pl.fissst.hibernatesearch.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private Date birthdate;

}
