package exercanimal2poo;

public class Mamifero extends Animal{
    protected String corDoPelo;
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
