import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

    @Test
    void longMediumShort() {
        assertEquals("venerdì 1 marzo 2002", dataStringFull);
        assertEquals("1 mar 2002", dataStringMedium);
        assertEquals("01/03/02", dataStringShort);
    }
}