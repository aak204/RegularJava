package org.example;

import java.util.regex.Pattern;

/**
 * Служебный класс, содержащий методы для проверки различных типов строк с использованием регулярных выражений.
 */
public class RegularJava {

    private static final Pattern IP_PATTERN = Pattern.compile(
            "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

    private static final Pattern GUID_PATTERN = Pattern.compile(
            "^(\\{?)[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}(\\}?)$");

    private static final Pattern URL_PATTERN = Pattern.compile(
            "^(https?://)?(www\\.)?([a-zA-Z0-9][a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}(:\\d+)?(/[\\w\\-./]*)" +
                    "*(\\?[\\w=&\\-]*)?(#[\\w\\-]*)?$");

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$");

    /**
     * Проверяет, является ли вводимая строка действительным IP-адресом.
     *
     * @param ip - строка для проверки.
     * @return true, если строка является действительным IP-адресом, false в противном случае
     */
    public static boolean isValidIP(String ip) {
        return IP_PATTERN.matcher(ip).matches();
    }

    /**
     * Проверяет, является ли входная строка действительным GUID.
     *
     * @param guid строка для проверки.
     * @return true, если строка является действительным GUID, false в противном случае
     */
    public static boolean isValidGUID(String guid) {
        return GUID_PATTERN.matcher(guid).matches();
    }

    /**
     * Проверяет, является ли входная строка действительным URL.
     *
     * @param url строка для проверки.
     * @return true, если строка является действительным URL, false в противном случае
     */
    public static boolean isValidURL(String url) {
        return URL_PATTERN.matcher(url).matches();
    }

    /**
     * Проверяет, является ли вводимая строка правильным паролем.
     * Правильный пароль должен содержать не менее 8 символов, включая как минимум одну заглавную букву, одну строчную букву и одну цифру.
     *
     * @param password строка для проверки.
     * @return true, если строка является правильным паролем, false в противном случае
     */
    public static boolean isValidPassword(String password) {
        return PASSWORD_PATTERN.matcher(password).matches();
    }
}
