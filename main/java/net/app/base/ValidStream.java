package net.app.base;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidStream implements Stream {

    private List<String> textValue;

    private int length;

    private int index = 0;

    ValidStream(String text) {
        this.textValue = Arrays.asList(text.split("")).stream()
                .map(String::toUpperCase).collect(Collectors.toList());

        this.length = this.textValue.size();
        this.index = 0;
    }


    @Override
    public char getNext() {
        return this.textValue.get(this.index++).charAt(0);
    }

    @Override
    public boolean hasNext() {
        return this.index < this.length;
    }

    public List<String> getTextValue() {
        return textValue;
    }

    public void setTextValue(List<String> textValue) {
        this.textValue = textValue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
