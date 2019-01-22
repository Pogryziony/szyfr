package com.github.pogryziony;

public class Szyfr {
    private final static int przesuniecie = 3;
    private final static String alfabet = new String("AaĄąBbCcĆćDdEeFfGgHhIiJjKkLlŁłMmNnOoPpRrSsTtUuVvWwYyXxZzŹźŻż");

    public static StringBuilder szyfrowanie() {
        StringBuilder text = new StringBuilder("AaPpZzŻż");
        StringBuilder zaszyfrowany = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                zaszyfrowany.append(' ');
            } else {
                char znak = (char) ((text.charAt(i) + przesuniecie - 65) % 26 + 65);
                zaszyfrowany.append(znak);
            }
            System.out.print(zaszyfrowany.charAt(i));
        }
        System.out.println();
        StringBuilder zaszyfrowany2 = new StringBuilder();

//Szyfr dla alfabetu polskiego
        for (int i = 0; i < text.length(); i++) {
            char znak = text.charAt(i);

            int idx = alfabet.indexOf(znak);

            idx = (idx + (przesuniecie + alfabet.length()) * 2) % alfabet.length();

            znak = alfabet.charAt(idx);

            zaszyfrowany2.append(znak);

        }

        return zaszyfrowany2;
    }

    public static StringBuilder deszyfrowanie() {
        StringBuilder zaszyfrowane = szyfrowanie();
        StringBuilder odszyfrowany = new StringBuilder();
        for (int i = 0; i < zaszyfrowane.length(); i++) {
            if (zaszyfrowane.charAt(i) == ' ') {
                odszyfrowany.append(' ');
            } else {
                char znak = (char) ((zaszyfrowane.charAt(i) - przesuniecie - 65) % 26 + 65);
                odszyfrowany.append(znak);
            }
        }

        return odszyfrowany;
    }
}
