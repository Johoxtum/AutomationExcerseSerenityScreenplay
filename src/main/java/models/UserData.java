package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserData {

    private String name;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String Company;
    private String address;
    private String state;
    private String City;
    private String Zipcode;
    private String MobileNumber;

}
