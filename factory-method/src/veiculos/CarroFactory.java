package veiculos;

public class CarroFactory implements VeiculosFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
