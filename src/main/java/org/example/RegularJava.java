package org.example;
import java.util.regex.*;

public class RegularJava {

    // Проверка IP адреса
    public static boolean isValidIP(String ip) {
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    // Проверка GUID
    public static boolean isValidGUID(String guid) {
        String regex = "^?([a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(guid);
        return matcher.matches();
    }

    // Проверка URL
    public static boolean isValidURL(String url) {
        String regex = "^(https?://)?(www\\.)?([a-zA-Z0-9][a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[\\w\\-./]*)" +
                "*(\\?[\\w=&\\-]*)?(#[\\w\\-]*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    // Проверка пароля
    public static boolean isValidPassword(String password) {
        String regexLength = "^[a-zA-Z0-9_]{8,}$";
        String regexLowercase = ".*[a-z].*";
        String regexUppercase = ".*[A-Z].*";
        String regexDigit = ".*[0-9].*";

        return password.matches(regexLength) && password.matches(regexLowercase) && password.matches(regexUppercase) && password.matches(regexDigit);
    }
}
