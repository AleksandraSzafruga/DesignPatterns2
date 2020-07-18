package strategy;

public class UpperCaseTextFormatter implements TextFormatterStrategy {

    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
