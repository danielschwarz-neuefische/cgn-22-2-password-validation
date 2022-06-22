import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void passwordTooShort() {
        Assertions.assertEquals(false, PasswordValidator.isLongerThan7("1234567"));
    }

    @Test
    void passwordIsLongEnough(){
        Assertions.assertEquals(true, PasswordValidator.isLongerThan7("12345678"));
    }

    @Test
    void passwordContainsDigit() {
        Assertions.assertEquals(true, PasswordValidator.containsDigit("test123"));
    }

    @Test
    void passwordContainsNoDigit() {
        Assertions.assertEquals(false, PasswordValidator.containsDigit("testABC"));
    }

    @Test
    void passwordContainsNoDigitButIsLongEnough(){
        Assertions.assertEquals(false, PasswordValidator.isValid("IchBinLangGenug!"));
    }

    @Test
    void passwordContainsDigitButIsNotLongEnough(){
        Assertions.assertEquals(false, PasswordValidator.isValid("IchBin1"));
    }

    @Test
    void passwordIsValid() {
        Assertions.assertEquals(true, PasswordValidator.isValid("Test123456789"));
    }
}
