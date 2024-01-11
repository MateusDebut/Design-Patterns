public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador
                .Builder( "16GB", "1TB SSD")
                .comProcessador("Intel i7")
                .comPlacaDeVideo("NVIDIA GeForce RTX 3080")
                .build();

        System.out.println(computador);
    }
}