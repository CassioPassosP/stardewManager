package classes;

public class GalinhaMae extends Animal {

    public GalinhaMae(int id, String tipo, String nome, int idade, String status) {
        super(id, tipo, nome, idade, status);
    }

    @Override
    public String coletarProduto() {
        return "Ovos coletados.";
    }

    @Override
    public String EmitirSom() {
        return "Pó Pó Pó";
    }
}
