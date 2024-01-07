package veiculos;

public class Barco implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("veiculos.Barco acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("veiculos.Barco freando...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("veiculos.Barco virando para " + direcao);
    }
}
