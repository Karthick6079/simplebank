package org.karthick.bank.validators;

import org.karthick.bank.Address;

public class AddressValidator  {

    public boolean validatePincode(String pincode){
        if(pincode.isBlank())
            throw new RuntimeException("Pincode should not be null or empty");
        else if(pincode.length() != 6)
            throw new RuntimeException("Invalid pincode!");
        else if(!(pincode.matches("\\d+")))
            throw new RuntimeException("Invalid pincode!");

        return true;
    }

    public boolean validateAddress(String address){
        if(address.isBlank()){
            throw new RuntimeException("Address should not be null or empty");
        } else if(address.length() < 30){
            throw new RuntimeException("Invalid Address");
        }

        return true;
    }

}
