package ir.maktab.service;

import ir.maktab.data.PersonDao;
import ir.maktab.model.Person;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;


@Getter
@Setter
public class PersonService {
    private PersonDao personDao;

    public void save(Person person) {
        personDao.save(person);
    }

//    public void update(Person person) {
//        personDao.update(person);
//    }

    public Person findByEmailAddress(String emailAddress) {
        Optional<Person> expert = personDao.findByEmailAddress(emailAddress);
        if (expert.isPresent()) {
            Person foundedUser = expert.get();
            return foundedUser;
        } else {
            throw new RuntimeException("emailAddress not exist!");
        }
    }
    public Person update(Person person) {
        return personDao.save(person);
    }

    public Person changePassword(Person person, String currentPassword, String newPassword) {
        String password = person.getPassword();
        if (password.equals(currentPassword)) {
            person.setPassword(newPassword);
            System.out.println("your password change successfully.");
            return update(person);
        } else {
            throw new RuntimeException("password is wrong!");
        }
    }
}
