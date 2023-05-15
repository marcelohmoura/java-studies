import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Data {
    String formato = "dd/MM/uuuu";
    DateTimeFormatter formatador = DateTimeFormatter
            .ofPattern(formato)
            .withResolverStyle(ResolverStyle.STRICT);

    public boolean dataValida(String data) {
        try {
            LocalDate dataFormatada = LocalDate.parse(data, formatador);
            return true;
        }
        catch (DateTimeParseException e) {
            return false;
        }
    }
}
