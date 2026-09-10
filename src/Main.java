import classes.GalinhaMae;
import classes.VacaMae;
import classes.subclasses.Bezerro;
import classes.subclasses.Pintinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        System.out.println("""
                --- MENU PRINCIPAL ---
                1. Ver animais do curral
                2. Comércio (Coletar/Retirar produtos)
                3. sair 
                
                Escolha uma opcao:
                """);

        escolha = leitura.nextInt();

        while (escolha != 3) {
            switch (escolha) {
                case 1:



                    break;

                case 2:


                    break;

                case 3:
                    System.out.println("Fechando menu...");

                    break;
            }
        }
    }
}