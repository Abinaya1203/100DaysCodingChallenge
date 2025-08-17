public class ValidParenthesesRecursion {
    public static boolean isValid(String s) {
        if (s.isEmpty()) return true;
        String updated = s.replace("()", "")
                          .replace("{}", "")
                          .replace("[]", "");
        if (updated.equals(s)) return false;
        return isValid(updated);
    }

