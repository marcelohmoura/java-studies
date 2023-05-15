import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;
import java.util.Date;
public class Data {
    String formato = "dd/MM/uuuu";
    DateTimeFormatter formatador = DateTimeFormatter
            .ofPattern(formato)
            .withResolverStyle(ResolverStyle.STRICT);

    public boolean dataValida(String data) {
        LocalDate dataFormatada = LocalDate.parse(data, formatador);
        return true;
    }
}
