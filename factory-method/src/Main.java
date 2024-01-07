import veiculos.BarcoFactory;
import veiculos.CarroFactory;
import veiculos.Veiculo;
import veiculos.VeiculosFactory;

public class Main {
    public static void main(String[] args) {
        VeiculosFactory carroFactory = new CarroFactory();
        Veiculo carro = carroFactory.criarVeiculo();
        carro.acelerar();
        carro.frear();
        carro.virar("esquerda");

        VeiculosFactory barcoFactory = new BarcoFactory();
        Veiculo barco = barcoFactory.criarVeiculo();
        barco.acelerar();
        barco.frear();
        barco.virar("esquerda");
    }
}