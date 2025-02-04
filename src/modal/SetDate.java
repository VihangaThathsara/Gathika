package modal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author isuru priyamntha
 */
public class SetDate {

    public static String getDate(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }
}
