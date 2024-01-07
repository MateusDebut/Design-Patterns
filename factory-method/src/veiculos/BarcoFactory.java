package veiculos;

public class BarcoFactory implements VeiculosFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Barco();
    }
}
