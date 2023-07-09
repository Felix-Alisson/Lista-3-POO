package revendaveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevendaVeiculos {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo (carro/moto): ");
        String tipoVeiculo = scanner.nextLine();

        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            Carro carro = new Carro("", 0, 0);
            carro.insertData();
            veiculos.add(carro);
        } else if (tipoVeiculo.equalsIgnoreCase("moto")) {
            Moto moto = new Moto("", 0, 0);
            moto.insertData();
            veiculos.add(moto);
        } else {
            System.out.println("Tipo de veículo inválido.");
        }

        System.out.println("Relatório dos veículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
        }

        double totalPreco = 0;

        for (Veiculo veiculo : veiculos) {
            totalPreco += veiculo.getPreco();
        }

        System.out.println("Total de preços antes do ajuste: " + totalPreco);

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    double novoPreco = moto.getPreco() * 1.1;
                    moto.setPreco(novoPreco);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    double novoPreco = carro.getPreco() * 0.92;
                    carro.setPreco(novoPreco);
                }
            }
        }

        double totalPrecoAjustado = 0;

        for (Veiculo veiculo : veiculos) {
            totalPrecoAjustado += veiculo.getPreco();
        }

        System.out.println("Total de preços após o ajuste: " + totalPrecoAjustado);

        scanner.close();
    }

}
