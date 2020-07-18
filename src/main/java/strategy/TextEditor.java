package strategy;

public class TextEditor {

    private TextFormatterStrategy formatterStrategy;

    public TextEditor(TextFormatterStrategy formatterStrategy) {
        this.formatterStrategy = formatterStrategy;
    }

    public void setFormatterStrategy(TextFormatterStrategy formatterStrategy) {
        this.formatterStrategy = formatterStrategy;
    }

    public void viewFormatted(String text) {
        System.out.println(formatterStrategy.format(text));
    }
}

