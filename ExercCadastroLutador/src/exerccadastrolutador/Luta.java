package exerccadastrolutador;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        
    }else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            }
    }
    
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("Luta aprovada, em seguida os participantes!");
            desafiado.apresentar();
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            switch (vencedor){
                case 0:
                    System.out.println("EMPATE");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                
                case 1:
                    System.out.println("Ganhou a luta: " + this.desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhou a luta: " + this.desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;                 
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
}
