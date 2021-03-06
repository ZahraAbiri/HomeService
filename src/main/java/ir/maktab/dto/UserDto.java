package ir.maktab.dto;

import ir.maktab.model.enums.PersonStatuse;
import ir.maktab.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private PersonStatuse personStatuse;
    private Date registrationDate;
    private Long credit;
    private Role role;
}
