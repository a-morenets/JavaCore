package _05_strings._01_regular_expressions;


/**
 * Created by a-morenets on 09.11.2016.
 */
public class RegExpSample {

    /* Regular expressions */
    public static final String REG_EX_NAME = "[A-Za-z]{3,20}"; // 3 to 20 letters
    public static final String REG_EX_NICK_NAME = "[A-Za-z_-]{3,10}"; // 3 to 10 letters, '_', '-'
    public static final String REG_EX_COMMENT = ".{0,255}"; // Max 255 characters
    public static final String REG_EX_GROUP = "FRIENDS|FAMILY|COWORKERS"; // FRIENDS|FAMILY|COWORKERS (enum)
    public static final String REG_EX_HOME_PHONE = "\\d{3}-\\d{2}-\\d{2}"; // xxx-xx-xx
    public static final String REG_EX_CELL_PHONE = "\\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}"; // (xxx) xxx-xx-xx
    public static final String REG_EX_YES_NO = "[YyNn]"; // Y/N (case insensitive)
    public static final String REG_EX_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*" +
            "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; // email
    public static final String REG_EX_SKYPE = "[a-zA-Z][a-zA-Z0-9\\.\\-_]{5,31}"; // 6 to 32 characters, starts with a letter, contain only letters and numbers
    public static final String REG_EX_POSTAL_CODE = "\\d{5}"; // 5 digits
    public static final String REG_EX_CITY = "[A-Za-z][A-Za-z-]*"; // 1 to 30 letters, '-'
    public static final String REG_EX_HOME_NUMBER = "\\d+[A-Za-z0-9\\/-]*"; // Digits, letters, '-', '/'
    public static final String REG_EX_APARTMENT_NUMBER = "\\d+"; // digits only
    public static final String REG_EX_DATE = "^\\d{4}\\/(0?[1-9]|1[012])\\/(0?[1-9]|[12][0-9]|3[01])$"; // yyyy/MM/dd
    
}