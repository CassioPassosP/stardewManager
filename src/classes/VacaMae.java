package classes;

public class VacaMae extends Animal {

    public VacaMae(int id, String tipo, String raca, String nome, int idade, String status) {
        super(id, tipo, raca, nome, idade, status);
    }

    @Override
    public String coletarProduto() {
        return "Leite coletado.";
    }

    @Override
    public String emitirSom() {
        return "Muuuuu MUUUUUUU!";
    }
}
