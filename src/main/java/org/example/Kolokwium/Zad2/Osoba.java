package org.example.Zad2;

abstract class Osoba {
    String nazwisko,imie;
    Osoba(String nazwisko, String imie) {
        this.nazwisko = nazwisko;
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
