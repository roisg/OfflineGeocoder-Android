package com.roisg.offlinegeocoder;

/**
 * Created by rsanchez on 20/03/15.
 */
public enum GeocodeKey {
    KEY_NAME("name"),
    KEY_ISOA2("iso_a2"),
    KEY_ISOA3("iso_a3");

    private final String value;

    private GeocodeKey(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
