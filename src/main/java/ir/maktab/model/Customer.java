package ir.maktab.model;

import ir.maktab.model.enums.PersonStatuse;
import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@Builder

public class Customer extends Person{

    public Customer() {
        super();
    }
}
