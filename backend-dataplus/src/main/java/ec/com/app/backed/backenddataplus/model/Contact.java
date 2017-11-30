package ec.com.app.backed.backenddataplus.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
public class Contact {
    @Column
    @Id
    @GeneratedValue
    int id;
    @Column @Getter @Setter private String firstName;
    @Column @Getter @Setter private String lastName;
    @Column @Getter @Setter private String email;
}