package strategy;

public class ReverseTextFormatter implements TextFormatterStrategy {

    @Override
    public String format(String text) {
        return new StringBuilder()
                .append(text)
                .reverse()
                .toString();
    }
}

