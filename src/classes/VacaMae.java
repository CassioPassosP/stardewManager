package classes;

public class VacaMae extends Animal {

    public VacaMae(int id, String tipo, String nome, int idade, String status) {
        super(id, tipo, nome, idade, status);
    }

    @Override
    public String coletarProduto() {
        return "Leite coletado.";
    }

    @Override
    public String EmitirSom() {
        return "Muuuuu MUUUUUUU!";
    }
}
