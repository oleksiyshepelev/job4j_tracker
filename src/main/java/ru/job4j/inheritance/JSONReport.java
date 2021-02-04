package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String name, String body) {
        return ("{" + System.lineSeparator() + "\"" + name + "\"" + " : " + "\""
                + body + "\"" + "," + System.lineSeparator() + "\"" + body + "\"" + " : " + "\""
                + body + "\"" + System.lineSeparator() + "}");
    }

    public static void main(String[] args) {
        JSONReport js = new JSONReport();
        System.out.println(js.generate("name", "body"));
    }
}
