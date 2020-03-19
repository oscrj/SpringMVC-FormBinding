package ecutb.springmvcformbinding.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import static ecutb.springmvcformbinding.constants.message.ValidationMessage.*;
import static ecutb.springmvcformbinding.constants.regex.RegexPattern.*;

public class CustomerFormDto {

    @NotBlank(message = EMAIL_REQUIRED)
    @Email(
            regexp = EMAIL_REGEX_PATTERN,
            flags = Pattern.Flag.CASE_INSENSITIVE,
            message = EMAIL_FORMAT_MESSAGE
    )
    private String email;
    private String address;
    @Pattern(regexp = CITY_VALIDATION_PATTERN,
            flags = Pattern.Flag.CASE_INSENSITIVE,
            message = VALID_CITY_NAME)

    private String city;
    @Pattern(regexp = SWEDISH_ZIPCODE_PATTERN,
            message = SWEDISH_ZIPCODE_FORMAT)
    private String zipCode;
    @Pattern(regexp = SWEDISH_PHONE_NUMBER_PATTERN,
            message = PHONE_FORMAT_MESSAGE)
    private String homePhone;
    @Pattern(regexp = SWEDISH_CELLPHONE_NUMBER,
            message = CELLPHONE_FORMAT_MESSAGE)
    private String cellPhone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String checkCityIsEmpty(String city){
        if(city.isEmpty()){
            return this.city = "Unknown";
        }
        return this.city;
    }

    public String checkAddressIsEmpty(String address){
        if(address.isEmpty()){
            return this.address  = "Unknown";
        }
        return this.address;
    }
}
