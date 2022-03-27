package co.com.sofka.util;

public enum ConstantsKey {


    CUSTOMERSERVICE("Customer service"),
    WEBMASTER("Webmaster");

    private final String value;

    ConstantsKey(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
