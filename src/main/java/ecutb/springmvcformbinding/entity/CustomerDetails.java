package ecutb.springmvcformbinding.entity;

import java.util.Objects;
import java.util.UUID;

public class CustomerDetails {
    private String detailsId;
    private String address;
    private String city;
    private String zipCode;
    private String homePhone;
    private String cellPhone;

    public CustomerDetails(String address, String city, String zipCode, String homePhone, String cellPhone) {
        this.detailsId = UUID.randomUUID().toString();
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
    }

    public CustomerDetails(){}

    public String getDetailsId() {
        return detailsId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDetails that = (CustomerDetails) o;
        return Objects.equals(detailsId, that.detailsId) &&
                Objects.equals(address, that.address) &&
                Objects.equals(zipCode, that.zipCode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(cellPhone, that.cellPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsId, address, zipCode, city, homePhone, cellPhone);
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "detailsId='" + detailsId + '\'' +
                ", street='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
