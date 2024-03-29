package org.experis.exercise2;

import java.util.Random;

public class Conto {
    //VARIABILI
    public String titolare;
    public int numeroC;

    public float saldo;

    //COSTRUTTORE
    public Conto(String titolareProprietario, int numeroConto) {
        titolare = titolareProprietario;
        numeroC = numeroConto;
        this.saldo = 0;
    }

    //METODI
    public void versamento(double totale) {
        saldo += totale;
    }

    public boolean prelevare(double totale) {
        if (saldo >= totale) {
            saldo -= totale;
            return true;
        } else {
            System.out.println("Errore: hai il saldo insufficiente");
            return false;
        }
    }
    public double getSaldo() {
        return saldo;

    }
}