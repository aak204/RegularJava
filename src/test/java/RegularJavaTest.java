import org.example.RegularJava;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegularJavaTest {

    /**
     * Тест для проверки корректности действующих IP-адресов.
     */
    @ParameterizedTest // Параметризованные тесты (аннотации)
    @ValueSource(strings = {"127.0.0.1", "192.168.1.1", "255.255.255.255", "0.0.0.0", "192.192.192.192", "192.0.0.0"})
    public void testIsValidIP(String ip) {
        assertTrue(RegularJava.isValidIP(ip));
    }

    /**
     * Тест для проверки корректности невалидных IP-адресов.
     */
    @ParameterizedTest
    @ValueSource(strings = {"1300.6.7.8", "256.256.256.256", "abc.def.gha.bcd", "-1300.6.7.8", "256.hh.hh.hh", "1300.6.7.8"})
    public void testNonValidIP(String ip) {
        assertFalse(RegularJava.isValidIP(ip));
    }

    /**
     * Тест для проверки корректности валидных GUID.
     */
    @ParameterizedTest
    @ValueSource(strings = {
            "{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}",
            "12345678-1234-1234-1234-123456789012",
            "00000000-0000-0000-0000-000000000000",
            "e02fd0e4-00fd-090A-ca30-0d00a0038ba0",
            "77454367-5555-6666-7777-0d00a0038ba0",
            "e02fd0e4-00fd-090A-ca30-0d00a0038ba0"})
    public void testIsValidGUID(String guid) {
        assertTrue(RegularJava.isValidGUID(guid));
    }

    /**
     * Тест для проверки корректности невалидных GUID.
     */
    @ParameterizedTest
    @ValueSource(strings = {
            "e02fd0e400fd090Aca300d00a0038ba0",
            "g02fd0e4-00fd-090A-ca30-0d00a0038ba0",
            "e02fd0e4-00fd-090A-ca30-0d00a0038baG",
            "--67uyhfghguhdfukhufuhfuidiufuodiuio",
            "{{g02fd0e4-00fd-090A-ca30-0d00a0038ba0",
            "44e02fd0e4-00fd-090A-ca30-0d00a0038baG"})
    public void testNonValidGUID(String guid) {
        assertFalse(RegularJava.isValidGUID(guid));
    }

    /**
     * Тест для проверки корректности валидных URL.
     */
    @ParameterizedTest
    @ValueSource(strings = {"http://www.example.com", "https://example.com", "example.com", "vyatsu.ru", "https://vyatsu.ru", "http://www.yandex.ru"})
    public void testIsValidURL(String url) {
        assertTrue(RegularJava.isValidURL(url));
    }

    /**
     * Тест для проверки корректности невалидных URL.
     */
    @ParameterizedTest
    @ValueSource(strings = {"Just Text", "http://a.com", "https://-example.com", "http://TEST", "htp://a.com", "htttp://a.com"})
    public void testNonValidURL(String url) {
        assertFalse(RegularJava.isValidURL(url));
    }

    /**
     * Тест для проверки корректности валидных паролей.
     */
    @ParameterizedTest
    @ValueSource(strings = {"C00l_Pass", "SupperPas1", "Password_123", "lowPass_8", "638279ygG", "7HHH__HHHbbb"})
    public void testIsValidPassword(String password) {
        assertTrue(RegularJava.isValidPassword(password));
    }

    /**
     * Тест для проверки корректности невалидных паролей.
     */
    @ParameterizedTest
    @ValueSource(strings = {"Cool_pass", "C00l", "PASSWORD123", "99999", "43682658hkdgfhfg", "j43882-"})
    public void testNonValidPassword(String password) {
        assertFalse(RegularJava.isValidPassword(password));
    }
}
