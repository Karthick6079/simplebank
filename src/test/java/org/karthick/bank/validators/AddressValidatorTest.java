package org.karthick.bank.validators;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddressValidatorTest {

    AddressValidator addressValidator;

    @BeforeAll
    void setUp() {
        addressValidator = new AddressValidator();
        System.out.println("The setup method called and address validator object created!!");
    }
    @Test
    @DisplayName("Exception thrown when pincode is null")
    public void getExceptionWhenPincodeIsNull(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validatePincode(null);
        });

    }

    @Test
    @DisplayName("Exception thrown when pincode is empty")
    public void getExceptionWhenPincodeIsEmpty(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validatePincode("");
        });
    }
    @Test
    @DisplayName("Exception thrown when pincode length is less than 6")
    public void getExceptionWhenPincodeLengthIsInvalid(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validatePincode("1212311");
        });
    }
    @Test
    @DisplayName("Exception thrown when pincode is not numbers")
    public void getExceptionWhenPincodeNotInNumbers(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validatePincode("1212de");
        });
    }

    @Test
    @DisplayName("Exception thrown when address is null")
    public void getExceptionWhenAddressIsNull(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validateAddress(null);
        });
    }
    @Test
    @DisplayName("Exception thrown when address is empty")
    public void getExceptionWhenAddressIsEmpty(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validateAddress("");
        });
    }

    @Test
    @DisplayName("Exception thrown when address does not have sufficient length")
    public void getExceptionWhenAddressLengthIsInvalid(){
        assertThrows(RuntimeException.class, () -> {
            addressValidator.validateAddress("1/23,12,12");
        });
    }

    @AfterAll
    void afterAll() {
        addressValidator = null;
        System.out.println("The address validator object will garbage collect");
    }
}