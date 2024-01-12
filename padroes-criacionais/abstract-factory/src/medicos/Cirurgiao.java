package medicos;

public class Cirurgiao implements EspecialidadeMedica{
    @Override
    public void tratarPaciente() {
        System.out.println("Cirurgião tratando paciente...");
    }
}
