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
}
