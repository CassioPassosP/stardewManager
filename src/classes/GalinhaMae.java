package classes;

import interfaces.Animal;

public class GalinhaMae implements Animal {
    @Override
    public String coletarProduto() {
        return "Ovos coletados.";
    }

    @Override
    public String EmitirSom() {
        return "Pó Pó Pó";
    }
}
