package com.Aula_03;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // Não pode ser add por ser privado
        c1.carga = 80;
        c1.tampada = false;
        c1.rabiscar();
        c1.status();
    }
}
