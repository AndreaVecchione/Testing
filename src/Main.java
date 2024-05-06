import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Main {


    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dateLong = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Grandezza lunga: " + dateLong);

    }

    static String formatInLong(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    static String formatInShort(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}