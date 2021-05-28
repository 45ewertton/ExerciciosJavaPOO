package execanimalpoo;

public class Reptil extends Animal {
    private String corDaEscama;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comento Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
