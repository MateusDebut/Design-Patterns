package medicos;

public class Cardiologista implements EspecialidadeMedica{
    @Override
    public void tratarPaciente() {
        System.out.println("Cardiologista tratando paciente...");
    }
}
