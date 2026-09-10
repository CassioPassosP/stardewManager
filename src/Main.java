import classes.Animal;
import classes.GalinhaMae;
import classes.VacaMae;
import classes.subclasses.Bezerro;
import classes.subclasses.Pintinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        Animal galinha = new GalinhaMae(102, "Galinha", "Rhode Island", "Cocó", 3, "Botando ovos");
        Animal vaca = new VacaMae(103, "Vaca", "Holandesa", "Mimosa", 5, "Amamentando um bezerro");
        Animal pintinho = new Pintinho(104, "Pintinho", "Leghorn", "Piu-Piu", 1, "Comendo");
        Animal bezerro = new Bezerro(105, "Bezerro", "Nelore", "Júnior", 1, "Mamando");

        animal.setAnimais(galinha);
        animal.setAnimais(vaca);
        animal.setAnimais(pintinho);
        animal.setAnimais(bezerro);

        while (escolha != 3) {

            System.out.println("""
                \n--- MENU PRINCIPAL ---
                1. Ver animais do curral
                2. Comércio (Coletar/Retirar produtos)
                3. sair 
                
                Escolha uma opcao:
                """);

            escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("""
                -----------------------------------------
                ANIMAIS NO CURRAL:
                -----------------------------------------
                """);
                    for (Animal animalMap : animal.getAnimais()){
                        System.out.println(animalMap.toString());
                    }

                    escolha = 0;
                    break;

                case 2:


                    break;

                case 3:
                    System.out.println("Fechando menu...");

                    break;

                default:
                    System.out.println("Opcao invalida.");

                    break;
            }
        }
    }
}