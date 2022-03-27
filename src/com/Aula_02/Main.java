package com.Aula_02;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.ponta = 0.7f;
        c2.cor = "preto";
        c2.tampar();
        c2.rabiscar();
    }
}
