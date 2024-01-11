// Classe de Produto (Product)
public class Computador {
    private String processador;
    private String memoriaRAM;
    private String discoRigido;
    private String placaDeVideo;

    private Computador() {}

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getDiscoRigido() {
        return discoRigido;
    }

    public void setDiscoRigido(String discoRigido) {
        this.discoRigido = discoRigido;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public String toString() {
        return "Computador [processador=" + processador + ", memoriaRAM=" + memoriaRAM + ", discoRigido=" + discoRigido
                + ", placaDeVideo=" + placaDeVideo + "]";
    }

    static class Builder {
        private String processador;
        private String memoriaRAM;
        private String discoRigido;
        private String placaDeVideo;

        public Builder(String memoriaRAM, String discoRigido) {
            this.memoriaRAM = memoriaRAM;
            this.discoRigido = discoRigido;
        }

        public Builder comProcessador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder comPlacaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Computador build() {
            Computador computador = new Computador();
            computador.processador = this.processador;
            computador.memoriaRAM = this.memoriaRAM;
            computador.discoRigido = this.discoRigido;
            computador.placaDeVideo = this.placaDeVideo;
            return computador;
        }
    }
}


