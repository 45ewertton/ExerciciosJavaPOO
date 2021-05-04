package exercobjetoconta;

public class ExercObjetoConta {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CP");
        p1.depositar(300);
        p1.sacar(450);
        p1.fecharConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CC");
        p2.depositar(500);
        p2.sacar(200);
        
        p1.conta();
        p2.conta();
    }
    
}
