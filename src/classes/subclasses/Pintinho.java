package classes.subclasses;

import classes.GalinhaMae;

public class Pintinho extends GalinhaMae {

    public Pintinho(int id, String tipo, String raca, String nome, int idade, String status) {
        super(id, tipo, raca, nome, idade, status);
    }

    @Override
    public String EmitirSom() {
        return "Piuuuu piu piiuuuu!";
    }
}
