public class PasswordValidator {


    public static boolean isValid(String password) {
        return containsDigit(password)
                && isLongerThan7(password)
                && containsLowerCase(password)
                && containsUpperCase(password);
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
}
