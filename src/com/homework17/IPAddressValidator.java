package com.homework17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {
    private Pattern pattern;
    private Matcher matcher;

    private static final String IPADDRESS_PATTERN = "^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.)" +
            "{3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]?)$";

    public IPAddressValidator(final String userIp) {
        pattern = Pattern.compile(IPADDRESS_PATTERN);
        if (validate(userIp)) {
            System.out.println("ip address: " + userIp + " is validate");
        } else {
            System.out.println("ip address: " + userIp + " isn't validate");
        }
    }

    private boolean validate(final String userIp) {
        matcher = pattern.matcher(userIp);
        return matcher.matches();
    }
}
