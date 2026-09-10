package classes.subclasses;

import classes.GalinhaMae;

public class Pintinho extends GalinhaMae {
    public Pintinho(int id, String tipo, String nome, int idade, String status) {
        super(id, tipo, nome, idade, status);
    }

    @Override
    public String EmitirSom() {
        return super.EmitirSom();
    }
}
