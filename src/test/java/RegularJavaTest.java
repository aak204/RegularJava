import org.example.RegularJava;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularJavaTest {

    @Test
    public void testIsValidIP() {
        assertTrue(RegularJava.isValidIP("127.0.0.1"));
        assertTrue(RegularJava.isValidIP("192.168.1.1"));
        assertTrue(RegularJava.isValidIP("255.255.255.255"));
        assertTrue(RegularJava.isValidIP("0.0.0.0"));
        assertTrue(RegularJava.isValidIP("192.192.192.192"));
        assertTrue(RegularJava.isValidIP("192.0.0.0"));
    }

    @Test
    public void testNonValidIP() {
        assertFalse(RegularJava.isValidIP("1300.6.7.8"));
        assertFalse(RegularJava.isValidIP("256.256.256.256"));
        assertFalse(RegularJava.isValidIP("abc.def.gha.bcd"));
        assertFalse(RegularJava.isValidIP("-1300.6.7.8"));
        assertFalse(RegularJava.isValidIP("256.hh.hh.hh"));
        assertFalse(RegularJava.isValidIP("1300.6.7.8"));
    }

    @Test
    public void testIsValidGUID() {
        assertTrue(RegularJava.isValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertTrue(RegularJava.isValidGUID("12345678-1234-1234-1234-123456789012"));
        assertTrue(RegularJava.isValidGUID("00000000-0000-0000-0000-000000000000"));

        assertFalse(RegularJava.isValidGUID("e02fd0e400fd090Aca300d00a0038ba0"));
        assertFalse(RegularJava.isValidGUID("g02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertFalse(RegularJava.isValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038baG"));
    }

    @Test
    public void testIsValidURL() {
        assertTrue(RegularJava.isValidURL("http://www.example.com"));
        assertTrue(RegularJava.isValidURL("https://example.com"));
        assertTrue(RegularJava.isValidURL("example.com"));

        assertFalse(RegularJava.isValidURL("Just Text"));
        assertFalse(RegularJava.isValidURL("http://a.com"));
        assertFalse(RegularJava.isValidURL("https://-example.com"));
    }

    @Test
    public void testIsValidPassword() {
        assertTrue(RegularJava.isValidPassword("C00l_Pass"));
        assertTrue(RegularJava.isValidPassword("SupperPas1"));
        assertTrue(RegularJava.isValidPassword("Password_123"));

        assertFalse(RegularJava.isValidPassword("Cool_pass"));
        assertFalse(RegularJava.isValidPassword("C00l"));
        assertFalse(RegularJava.isValidPassword("PASSWORD123"));
    }
}
