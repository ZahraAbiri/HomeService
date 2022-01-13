package ir.maktab.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double score;
    String desciption;
    @ManyToOne
    private Customer customer;
//    @ManyToOne(nullabale=flase)
    private Expert expert;
    @OneToOne
    private Order order;
}
