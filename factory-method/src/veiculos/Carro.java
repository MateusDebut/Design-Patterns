package veiculos;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Freando...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Virando para " + direcao);
    }
}
