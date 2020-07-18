package strategy;

public class LowerCaseTextFormatter implements TextFormatterStrategy {

    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
