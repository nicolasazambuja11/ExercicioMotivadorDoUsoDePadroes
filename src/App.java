import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite qual é o seu modelo de carro: ");
        System.out.println("1. Básico\n2. Esportivo\n3. Utilitário\n4. SUV\n5. SUVFlex\n6. Econo");
        int opcao = in.nextInt();

        Carro carro = null;

        switch (opcao) {
            case 1:
                carro = new Carro("Básico", TipoCombustivel.GASOLINA, 10, 55);
                break;
            case 2:
                carro = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
                break;
            case 3:
                carro = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
                break;
            case 4:
                carro = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);
                break;
            case 5:
                carro = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 55);
                break;
            case 6:
                carro = new Carro("Econo", TipoCombustivel.GASOLINA, 12, 45);
                break;
            default:
                System.out.println("Opção inválida!");
                in.close();
                return; 
        }

        System.out.println(carro.toString());

        System.out.println("\n----------------");
        System.out.println("\nAbastecendo o carro " + carro.getModelo());
        carro.abastece(carro.getTipoCombustivel(), carro.getCapacidadeTanque());
        System.out.println(carro.toString());

        System.out.println("\nViajando com o carro " + carro.getModelo());
        carro.viaja(250);
        carro.viaja(150);
        System.out.println(carro.toString());

        in.close();
    }
}
