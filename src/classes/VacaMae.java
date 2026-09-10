package classes;

import interfaces.Animal;

public class VacaMae implements Animal {
    @Override
    public String coletarProduto() {
        return "Leite coletado.";
    }

    @Override
    public String EmitirSom() {
        return "Muuuuu MUUUUUUU!";
    }
}
