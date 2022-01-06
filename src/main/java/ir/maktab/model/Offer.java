package ir.maktab.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Expert expert;
    @CreationTimestamp
    private Date registrationDate;
    private Long proposedPrice;
    private int durationOfWork;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
}
