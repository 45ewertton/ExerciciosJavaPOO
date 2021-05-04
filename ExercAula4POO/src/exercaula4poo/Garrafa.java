package exercaula4poo;

public class Garrafa {

    private String marca;
    private String cor;
    private boolean cheia;

    public Garrafa(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.encher();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCheia() {
        return cheia;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    public void encher() {
        this.cheia = true;
    }

    public void secar() {
        this.cheia = false;
    }

    public void status() {
        System.out.println("SOBRE A GARRAFA!!!");
        System.out.println("MARCA: " + this.getMarca());
        System.out.println("COR: " + this.getCor());

        if (this.cheia == true) {
            System.out.println("A GARRAFA ESTÁ CHEIA");
        } else {
            System.out.println("A GARRAFA ESTÁ VAZIA");
        }
        System.out.println("----------------------------");
    }
}
