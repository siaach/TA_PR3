import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {

    IF_KEYWORD ("if"),
    THEN_KEYWORD ("then"),
    ELSE_KEYWORD ("else"),
    SIXTEEN_SYMB ("\\p{XDigit}+"),
    SEMICOLON (";"),

    OPEN_BRACKET ("\\{"),
    CLOSE_BRACKET ("\\}"),
    OPEN_PARENTHESIS ("\\("),
    CLOSE_PARENTHESIS ("\\)"),

    EQUAL ("=="),
    EQUAL_WITH_DOT (":="),
    GREATER_EQUAL (">="),
    LESSER_EQUAL ("<="),
    ATTRIBUTION ("="),
    GREATER (">"),
    LESSER ("<"),


    ADDITION ("\\+"),
    SUBTRACTION ("-"),
    MULTIPLICATION ("\\*"),
    DIVISION ("/"),
    MODULUS ("%"),

    STRING ("\"[^\"]+\""),
    NUMBER ("\\d+(\\.\\d+)?"),
    IDENTIFIER ("\\w+");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }

        return -1;
    }
}