/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastromidias;

public class DVD extends Midia {
    private int faixas;

    public DVD() {
    }

    public DVD(int codigo, double preco, String nome, int faixas) {
        super(codigo, preco, nome);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String getTipo() {
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() + ", Número de Faixas: " + faixas;
    }

    public void inserirDados(int codigo, double preco, String nome, int faixas) {
        super.inserirDados(codigo, preco, nome);
        this.faixas = faixas;
    }
}
