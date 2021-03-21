package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("Element Not Found Exception");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] val = {"hola", "como va?", "que tal?"};
        try {
            System.out.println(indexOf(val, "Hola"));
        } catch (ElementNotFoundException el) {
            System.out.println(el);
        }
    }
}