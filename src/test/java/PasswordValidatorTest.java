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
    void passwordContainsDigitAndIsLongEnoughButOnlyUpperCase(){
        Assertions.assertEquals(false, PasswordValidator.isValid("PASSWORD1"));
    }

    @Test
    void passwordContainsDigitAndIsLongEnoughButOnlyLowerCase(){
        Assertions.assertEquals(false, PasswordValidator.isValid("password1"));
    }

    @Test
    void passwordIsValid() {
        Assertions.assertEquals(true, PasswordValidator.isValid("Test123456789"));
    }

    @Test
    void passwordContainsLowerCase(){
        Assertions.assertEquals(true, PasswordValidator.containsLowerCase("a"));
    }

    @Test
    void passwordDoesNotContainLowerCase() {
        Assertions.assertEquals(false, PasswordValidator.containsLowerCase("A"));
    }

    @Test
    void passwordWithSSContainLowerCase() {
        Assertions.assertEquals(true, PasswordValidator.containsLowerCase("ß"));
    }

    @Test
    void passwordContainsUpperCase(){
        Assertions.assertEquals(true, PasswordValidator.containsUpperCase("A"));
    }

    @Test
    void passwordDoesNotContainUpperCase() {
        Assertions.assertEquals(false, PasswordValidator.containsUpperCase("a"));
    }
}
