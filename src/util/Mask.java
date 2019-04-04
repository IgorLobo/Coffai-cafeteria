package util;

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

}
