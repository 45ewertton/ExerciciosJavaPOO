package exercobjetoconta;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {

        this.status = false;
        this.saldo = 0f;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            System.out.println("Conta aberta corretamente!");
            System.out.println("A conta é corrente e foi adicionado 50 reais!");
            this.setSaldo(50);
        } else if(t == "CP"){
            System.out.println("Conta aberta corretamente!");
            System.out.println("A conta é poupança e foi adicionado 150 reais!");
            this.setSaldo(150); 
        } else {
            this.setStatus(false);
            System.out.println("Escolha um tipo de conta corretamente!");
        }
      
    }

    public void fecharConta() {
        if (this.getSaldo() > 0){
            System.out.println("Não foi possivel fechar conta, ainda contem dinheiro.");
        }else if(this.getSaldo() < 0) {
            System.out.println("Não foi possivel fechar conta, você está devendo.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("Não foi possível depositar, conta fechada!");
        }

    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de: " + getDono());
            }else{
                System.out.println("Não foi possivel sacar dinheiro, saldo insuficiente.");
            }
                
        } else{
            System.out.println("Conta está fechada!");
        }
    }

    public void pagarMensal(String t) {
        int v = 0;
        if (t == "CC") {
            v = 12;
        } else if(t == "CP"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga do dono: " + this.getDono());
        }else{
            System.out.println("Impossivel, conta fechada.");
        }

    }
    
    public void conta(){
        System.out.println("-----------------------");
        System.out.println("O NÚMERO da conta: " + this.getNumConta());
        System.out.println("O TIPO da conta: " + this.getTipo());
        System.out.println("O DONO da conta: " + this.getDono());
        System.out.println("O SALDO da conta: " + this.getSaldo());
        System.out.println("O STATUS da conta: " + this.isStatus());
    }
}
