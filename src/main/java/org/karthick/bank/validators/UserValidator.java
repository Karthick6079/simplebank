package org.karthick.bank.validators;

import org.karthick.bank.Address;

public class UserValidator {

    public boolean validateUserFirstName(String firstName){
        if(firstName.isBlank())
            throw new RuntimeException("First name cannot be null or empty!");
        return true;
    }

    public boolean validateUserLastName(String lastName){
        if(lastName.isBlank())
            throw new RuntimeException("Last name cannot be null or empty!");
        return true;
    }

    public boolean validatePAN(String pan){
        if(pan.isBlank())
            throw new RuntimeException("PAN number cannot be null or empty!");
        if(pan.length() != 10)
            throw new RuntimeException("Invalid PAN number!");
        if(!pan.matches("^[A-Z]{5}\\d{4}[A-Z]{1}$")){
            throw new RuntimeException("Invalid PAN number!");
        }
        return true;
    }

    public boolean validateAadhar(String aadhar){
        if(aadhar.isBlank())
            throw new RuntimeException("PAN number cannot be null or empty!");
        if(aadhar.length() != 14)
            throw new RuntimeException("Invalid AADHAAR number!");
        if(!aadhar.matches("^[^0-1]\\d{3}\\s\\d{4}\\s\\d{4}$")){
            throw new RuntimeException("Invalid AADHAAR number!");
        }
        return true;
    }

    public boolean validateEmail(String email){

        if(email.isBlank())
            throw new RuntimeException("email address cannot be null or empty!");

        if(!email.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$")){
            throw new RuntimeException("Invalid e-mail address!");
        }
        return true;
    }

    public boolean validatePhoneNumber(String phoneNumber){
        if(phoneNumber.isBlank())
            throw new RuntimeException("phone number cannot be null or empty!");
        if(phoneNumber.length() != 10)
            throw new RuntimeException("Invalid Phone number!");
        return true;
    }

    public boolean addressValidator(Address address){
        if(address == null)
            throw new RuntimeException("Invalid Address");
        return true;
    }

}
