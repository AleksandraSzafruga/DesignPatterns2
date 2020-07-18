package strategy;

public class Main {

    public static void main(String[] args) {

        String text = "Ala ma Kota";

        TextEditor textEditor = new TextEditor(new LowerCaseTextFormatter());
        textEditor.viewFormatted(text);

        textEditor.setFormatterStrategy(new UpperCaseTextFormatter());
        textEditor.viewFormatted(text);

        textEditor.setFormatterStrategy(new ReverseTextFormatter());
        textEditor.viewFormatted(text);

        //Dla chętnych
        //Napisać strategię do odwracania kolejnośći wyrazów

    }

}

