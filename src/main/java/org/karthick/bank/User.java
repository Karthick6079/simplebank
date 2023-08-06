package org.karthick.bank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    @ToString.Exclude
    private String id;
    private String firstName;
    private String lastName;
    @ToString.Exclude
    private String aadharNo;
    @ToString.Exclude
    private String panNo;
    @ToString.Exclude
    private String email;
    @ToString.Exclude
    private String phoneNumber;
    @ToString.Exclude
    private String alternatePhoneNumber;
    private Address address;
    private Address communicationAddress;

    public User(String firstName, String lastName, String panNo, String email, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.panNo = panNo;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
