import medicos.EspecialidadeMedica;

public class SistemaHospitalar {
    public void tratarPaciente(EspecialidadeMedica especialidade) {
        System.out.println("Paciente chegou à " + especialidade.getClass().getSimpleName());
        especialidade.tratarPaciente();
    }
}
