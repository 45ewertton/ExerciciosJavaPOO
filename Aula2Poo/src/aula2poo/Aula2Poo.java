package aula2poo;

public class Aula2Poo {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "preta";
        c1.ponta = 1.0f;
        c1.carga = 100;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }

}
