package org.experis.exercise1;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    public int codice;
    public String nome;
    public String descrizione;
    public double prezzo;
    public double iva;

    //COSTRUTTORI

    public Prodotto(String nomeProdotto, String descrizioneProdotto, double prezzoBase, double ivaProdotto){
        nome = nomeProdotto;
        codice = random();
        descrizione = descrizioneProdotto;
        prezzo = prezzoBase;
        iva = ivaProdotto;

    }


    //METODI
    public int random(){
        Random random = new Random();
        return random.nextInt(100000000);
    }
    public double price(){
       return prezzo;
    }
    public double priceIva(){
        return prezzo * (1 + iva / 100);
    }
    public String nomeEsteso() {
        String nomeCodice = String.format("%08d", codice); // Pad left di 0
        return nomeCodice + "-" + nome;
    }




}
