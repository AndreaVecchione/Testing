import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
//Andiamo a testare il funzionamento del metodo con lunghezza LONG
    @Test

    public void testDateLong() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatData = Main.formatInLong(dateTime);
        String dataFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        assertEquals(dataFormat, formatData);
        System.out.println("data long: " + dataFormat);


    }
    //Andiamo a testare il funzionamento del metodo con lunghezza SHORT
@Test
    public void testDateShort() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatData = Main.formatInShort(dateTime);
        String dataFormat = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        assertEquals(dataFormat, formatData);
        System.out.println("data short: " + formatData);

    }
}
