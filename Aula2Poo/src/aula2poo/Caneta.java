package aula2poo;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta " + this.modelo);
        System.out.println("De cor " + this.cor);
        System.out.println("Com ponta " + this.ponta);
        System.out.println("Com carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("não Rabiscando");
        } else {
            System.out.println("rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
