import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        //Stampa le varie versioni - Crea dei test per questo esercizio
        System.out.println("Full: " + dataStringFull);
        System.out.println("Medium: " + dataStringMedium);
        System.out.println("Short: " + dataStringShort);
    }
}