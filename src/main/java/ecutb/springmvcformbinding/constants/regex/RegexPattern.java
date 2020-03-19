package ecutb.springmvcformbinding.constants.regex;

public class RegexPattern {

    public static final String EMAIL_REGEX_PATTERN = "^(\\D)+(\\w)*((\\.(\\w)+)?)+@(\\D)+(\\w)*((\\.(\\D)+(\\w)*)+)?(\\.)[a-z]{2,}$";
    public static final String CITY_VALIDATION_PATTERN = "^([a-zA-Z\u0080-\u024F]+(?:. |-| |'))*[a-zA-Z\u0080-\u024F]*$";
    public static final String SWEDISH_ZIPCODE_PATTERN = "^\\d{3}\\s*\\d{2}$";
    public static final String SWEDISH_PHONE_NUMBER_PATTERN = "(^\\+[0-9]{2}|^\\+[0-9]{2}\\(0\\)|^\\(\\+[0-9]{2}\\)\\(0\\)|^00[0-9]{2}|^0)([0-9]{9}$|[0-9\\-\\s]{10}$)";
    public static final String SWEDISH_CELLPHONE_NUMBER = "^(([+]46)\\s*(7)|07)[02369]\\s*(\\d{4})\\s*(\\d{3})$";
}
