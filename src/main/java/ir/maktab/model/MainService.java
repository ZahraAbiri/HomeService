package ir.maktab.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class MainService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
    @OneToMany(mappedBy = "mainService")
    private Set<SubService> subServices;//new

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
