/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revendaveiculos;

import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do carro: ");
        setModelo(scanner.nextLine());
        System.out.println("Digite o preço do carro: ");
        setPreco(scanner.nextDouble());
        System.out.println("Digite a quilometragem do carro: ");
        setKm(scanner.nextDouble());
        scanner.close();
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return super.getPreco() * 0.92;
        } else {
            return super.getPreco();
        }
    }
}
