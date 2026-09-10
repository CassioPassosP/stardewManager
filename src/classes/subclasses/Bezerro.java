package classes.subclasses;

import classes.VacaMae;

public class Bezerro extends VacaMae {

    public Bezerro(int id, String tipo, String raca, String nome, int idade, String status) {
        super(id, tipo, raca, nome, idade, status);
    }

    @Override
    public String EmitirSom() {
        return "Meee meeeeee";
    }
}
