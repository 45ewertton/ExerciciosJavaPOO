package aula2poo;

public class Caneta {

   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;

   public void status() {
        System.out.println("Uma caneta " + this.modelo);
        System.out.println("De cor " + this.cor);
        System.out.println("Com ponta " + this.ponta);
        System.out.println("Com carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

   public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("não Rabiscando");
        } else {
            System.out.println("rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
