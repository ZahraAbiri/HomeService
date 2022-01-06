package ir.maktab.model;

import ir.maktab.model.enums.PersonStatuse;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String family;
    private String emailAddress;
    private String password;
    @Enumerated(EnumType.STRING)
    private PersonStatuse personStatuse;
    @CreationTimestamp
    private Date registrationDate;
    private Long credit;
}
