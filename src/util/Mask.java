package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Mask extends PlainDocument {

    int tam = 0;
    String regex = "";

    public Mask(int tamanho, String regex) {
        this.tam = tamanho;
        this.regex = regex;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

        int tamanho = (this.getLength() + str.length());
        if (tamanho <= tam) {
            super.insertString(offs, str.replaceAll(regex, ""), a);
        } else {
            super.insertString(tam, str.replaceAll("[aA0-zZ9]", ""), a);
        }
    }

    public static Date formatarData(String parametro) throws ParseException {
        DateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        if (!parametro.isEmpty()) {
            return new java.sql.Date(formatar.parse(parametro).getTime());
        }
        return null;
    }

    public static String converteData(java.util.Date dtData) {
        SimpleDateFormat formatBra;
        formatBra = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date newData = formatBra.parse(dtData.toString());
            return (formatBra.format(newData));
        } catch (ParseException Ex) {
            return "Erro na conversão da data";
        }
    }

}
