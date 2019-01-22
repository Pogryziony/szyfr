package com.github.pogryziony;
import com.github.pogryziony.Szyfr;
/*
 * Program szyfruje text szyfrem cezara
 * zakladam że jedyne znaki ktore mozna wprowadzic to duże litery alfabetu lacinskiego i spacja
 * spacja zostaje sapcja a litery sa szyfrowane
 */

public class Main {
    public static void main(String[] args) {
    Szyfr.szyfrowanie();
    Szyfr.deszyfrowanie();
    }
}