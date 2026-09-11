package classes;

public class Ovelha extends Animal{

    public Ovelha(int id, String tipo, String raca, String nome, int idade, String status) {
        super(id, tipo, raca, nome, idade, status);
    }

    @Override
    public String coletarProduto() {
        return "Lã coletada.";
    }

    @Override
    public String emitirSom() {
        return "Méééé";
    }
}
