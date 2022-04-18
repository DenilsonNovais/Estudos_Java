package com.Aula_03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.print("|Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.cor);
        System.out.print("ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga);
        System.out.print("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO: Não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
