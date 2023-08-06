package org.karthick.bank.validators;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.karthick.bank.Address;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserValidatorTest {

    UserValidator userValidator;

    Address address;

    @BeforeAll
    void setUp() {
        userValidator = new UserValidator();
        address = new Address("2/12, Muthuraman street, KK nagar, Chennai","600078",false);
        System.out.println("The setup method is called and user validator object created!");
    }

    @Test
    @DisplayName("Throw exception when first name is null")
    void throwExceptionWhenFirstNameIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateUserFirstName(null);
        });
    }

    @Test
    @DisplayName("Throw exception when first name is empty")
    void throwExceptionWhenFirstNameIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateUserFirstName("");
        });
    }

    @RepeatedTest( value = 5)
    @DisplayName("Repeat  first name validate test 5 times")
    void returnTrueWhenFirstNameIsValid(){
        assertTrue(userValidator.validateUserFirstName("Karthick"));
    }


    @Test
    @DisplayName("Throw exception when last name is null")
    void throwExceptionWhenLastNameIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateUserLastName(null);
        });
    }

    @Test
    @DisplayName("Throw exception when last name is empty")
    void throwExceptionWhenLastNameIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateUserLastName("");
        });
    }

    @Test
    @DisplayName("Return true when first name is valid")
    void returnTrueWhenLastNameIsValid(){
        assertTrue(userValidator.validateUserFirstName("V"));
    }

    @Test
    @DisplayName("Throw exception when address is null")
    void throwExceptionWhenAddressIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.addressValidator(null);
        });
    }

    @Test
    @DisplayName("Return true when address is valid")
    void returnTrueWhenAddressIsValid(){
        assertTrue(userValidator.addressValidator(address));
    }

    @Test
    @DisplayName("Throw exception when PAN is null")
    void throwExceptionWhenPANIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePAN(null);
        });
    }
    @Test
    @DisplayName("Throw exception when PAN is empty")
    void throwExceptionWhenPANIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePAN("");
        });
    }

    @Test
    @DisplayName("Throw exception when PAN length is invalid")
    void throwExceptionWhenPANlengthIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePAN("121212");
        });
    }

    @Test
    @DisplayName("Throw exception when PAN format is invalid ")
    void throwExceptionWhenPANFormatIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePAN("qwewqe1212a");
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"AKSDE3241F", "AKWSE3241F","AKSDE3241F", "AKASE3241F"})
    @DisplayName("Return true when PAN is valid")
    void returnTrueWhenPANIsValid(String value){
        assertTrue(userValidator.validatePAN(value));
    }

    @Test
    @DisplayName("Throw exception when Aadhar is null")
    void throwExceptionWhenAadharIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateAadhar(null);
        });
    }
    @Test
    @DisplayName("Throw exception when Aadhar is empty")
    void throwExceptionWhenAadharIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateAadhar("");
        });
    }

    @Test
    @DisplayName("Throw exception when Aadhar length is invalid")
    void throwExceptionWhenAadharlengthIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateAadhar("121212");
        });
    }

    @Test
    @DisplayName("Throw exception when Aadhar format is invalid ")
    void throwExceptionWhenAadharFormatIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateAadhar("0112 1212 1212");
        });
    }

    @ParameterizedTest
    @DisplayName("Validate list of aadhar test data from csv file")
    @CsvFileSource(resources = "/aadhardata.csv")
    void returnTrueWhenAadharIsValid(String aadhar){
        assertTrue(userValidator.validateAadhar(aadhar));
    }


    @Test
    @DisplayName("Throw exception when Email is null")
    void throwExceptionWhenEmailIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateEmail(null);
        });
    }
    @Test
    @DisplayName("Throw exception when Email is empty")
    void throwExceptionWhenEmailIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateEmail("");
        });
    }

    @Test
    @DisplayName("Throw exception when Email length is invalid")
    void throwExceptionWhenEmaillengthIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validateEmail("121212");
        });
    }

    @Test
    @DisplayName("Return true when Email is valid")
    void returnTrueWhenEmailIsValid(){
        assertTrue(userValidator.validateEmail("karthick7@gamail.com"));
    }

    @Test
    @DisplayName("Throw exception when PhoneNumber is null")
    void throwExceptionWhenPhoneNumberIsNull() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePhoneNumber(null);
        });
    }
    @Test
    @DisplayName("Throw exception when PhoneNumber is empty")
    void throwExceptionWhenPhoneNumberIsEmpty() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePhoneNumber("");
        });
    }

    @Test
    @DisplayName("Throw exception when PhoneNumber length is invalid")
    void throwExceptionWhenPhoneNumberlengthIsInvalid() {
        assertThrows(RuntimeException.class, () ->{
            userValidator.validatePhoneNumber("121212");
        });
    }

    @Test
    @DisplayName("Return true when PhoneNumber is valid")
    void returnTrueWhenPhoneNumberIsValid(){
        assertTrue(userValidator.validatePhoneNumber("9812112122"));
    }


}