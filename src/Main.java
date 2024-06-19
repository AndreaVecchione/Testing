import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Main {


    public static void main(String[] args) {
        //Creo un oggetto che stamperà una data
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
//data scritta in lunghezza LONG
        String dateLong = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Grandezza lunga: " + dateLong);

    }
//Metodi che andremo poi a testare nella classe test
    static String formatInLong(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    static String formatInShort(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
