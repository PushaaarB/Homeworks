import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static boolean testMail(String str) {
        boolean result = false;
        Pattern pat;
        Matcher mat;

        pat = Pattern.compile("^[\\w.-]+@[[a-zA-Z-]+.]*[a-zA-Z-]+\\.[a-zA-Z]{2,4}$");
        mat = pat.matcher(str);

        if (mat.find()) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
