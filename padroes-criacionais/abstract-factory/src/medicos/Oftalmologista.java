package medicos;

public class Oftalmologista implements EspecialidadeMedica{
    @Override
    public void tratarPaciente() {
        System.out.println("Oftalmologista tratando paciente...");
    }
}
