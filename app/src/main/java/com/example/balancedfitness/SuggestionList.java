package com.example.balancedfitness;

import java.util.ArrayList;

class SuggestionList {
    private static final SuggestionList ourInstance = new SuggestionList();
    private ArrayList<Sport> sports;
    static SuggestionList getInstance() {
        return ourInstance;
    }

    private SuggestionList() {
        sports = new ArrayList<>();
        sports.add(new Sport("Mäkijuoksu", "Kestävyys", "Juokseminen on kestävyysharjoittelun klassikko. " +
                "\nMutta tiesitkö, että mäkijuoksu on tasaisella maalla juoksemista tehokkaampaa treeniä?"));
        sports.add(new Sport("Uinti", "Kestävyys","Uinti toteutetaan vedessä, yleensä uima-altaassa. " +
                "\nJalat pärskyttävät vettä ja on tosi hauskaa. \nMutta myös kunto kohenee ;)"));
        sports.add(new Sport("Pyöräily", "Kestävyys", "Ehkä omistat polkupyörän? Silloin olet onnekas. " +
                "\nPyöräily on loistava kestävyyttä lisäävä harjoitus. " +
                "\nPyöriä voi myös vuokrata, ellet omista sellaista. " +
                "\n\n(Muista myös kuntopyörät!)"));
        sports.add(new Sport("Naruhyppely", "Kestävyys","Naruhyppely on erinomainen kestävyysharjoite. " +
                "\nMieleen tulee ikonisia kuvia narua hyppäävistä nyrkkeilijöistä salilla sparrauskierrosten välissä. " +
                "\nEye of the Tiger, baby!"));
        sports.add(new Sport("Punttitreeni", "Voima", "Punttitreeni on klassikko. " +
                "\nEi muuta kuin salille ja puntit tassuihin.\nYlös alas, toistoja toiston perään!"));
        sports.add(new Sport("Kehopainotreeni", "Voima","Kehopainotreeni on hyvä vaihtoehto painoharjoittelulle. " +
                "\nEsimerkiksi lankut, punnerrukset ja leuanvedot ovat erinomaisia voimankasvattajia."));
        sports.add(new Sport("Kahvakuulat", "Voima","Kahvakuula on erinomainen voimaharjoitteluväline." +
                "\nMuista kuitenkin turvallisuus! Aloita kahvakuulaharjoittelu kokeneen ohjaajan kanssa."));
        sports.add(new Sport("Core-treeni", "Voima","Core pitää koko kehoa koossa. " +
                "\nVatsan ja kylkien lihakset ovat tärkeimpiä lihaksia kehon kokonaisvaltaisen hyvinvoinnin kannalta. " +
                "\n\nEntä milloin viimeksi treenasit selkälihaksiasi?"));
        sports.add(new Sport("Astangajooga", "Jooga", "Astangajooga on voimistelullinen joogamuoto, jossa hiki virtaa. " +
                "\nHengitys ohjaa liikettä ja punnertamista. (Sitä kutsutaan Vinyasaksi)"));
        sports.add(new Sport("Hot Yoga", "Jooga", "Hot Yogaa tehdään lämmitetyssä salissa. " +
                "\nKuuma ilma auttaa lihaksia rentoutumaan ja saa hien virtaamaan."));
        sports.add(new Sport("Nokoset", "Lepo", "Nukkuminen on erittäin tärkeää palautumisen kannalta. " +
                "\nJollet saanut viime yönä kahdeksaa tuntia unta, mitä jos ottaisit pienet nokoset?"));
        sports.add(new Sport("E-Sports", "Lepo", "Lepopäivän ratoksi voi vaikka istuutua mukavasti sohvalle ja alkaa räiskiä jotain absurdia mättöpeliä. " +
                "\n\nTunnetko esimerkiksi peliä nimeltä Dota?."));
    }

    public ArrayList<Sport> getSports(){
        return sports;
    }

    public Sport getSport (int i) {
        return this.sports.get(i);
    }
}
