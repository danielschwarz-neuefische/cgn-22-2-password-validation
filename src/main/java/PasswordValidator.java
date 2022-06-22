public class PasswordValidator {

    static String[] prohibitedTexts = {
            "Password1",
            "Geheim123",
    };

    public static boolean isValid(String password) {
        return containsDigit(password)
                && isLongerThan7(password)
                && containsLowerCase(password)
                && containsUpperCase(password)
                && !isInSetOfProhibitedTexts(password);
    }

    public static boolean isLongerThan7(String password) {
        return password.length() > 7;
    }

    public static boolean containsDigit(String password) {
        for (char letter : password.toCharArray()){
            if (Character.isDigit(letter)){
                return true;
            }
        }
        return false;
    }

    public static boolean containsLowerCase(String password) {
        return !password.equals(password.toUpperCase());
    }

    public static boolean containsUpperCase(String password) {
        return !password.equals(password.toLowerCase());
    }

    public static boolean isInSetOfProhibitedTexts(String password) {
        for (String prohibitedText : prohibitedTexts) {
            if (password.equals(prohibitedText)) {
                return true;
            }
        }
        return false;
    }
}
