package ir.maktab.model;

import ir.maktab.model.enums.PersonStatuse;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
@Data
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstNAme;//todo
    private String Lastname;
    @Column(unique = true)
    private String emailAddress;
//
    private String password;
    @Enumerated(EnumType.STRING)
    private PersonStatuse personStatuse;
    @CreationTimestamp
    private Date registrationDate;
    private Long credit;
}
