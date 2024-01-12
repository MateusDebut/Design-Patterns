import medicos.*;
import medicos.factory.CardiologistaFactory;
import medicos.factory.CirurgiaoFactory;
import medicos.factory.HospitalFactory;
import medicos.factory.OftalmologistaFactory;

public class Main {
    public static void main(String[] args) {
        SistemaHospitalar sistema = new SistemaHospitalar();

        HospitalFactory cirurgiaFactory = new CirurgiaoFactory();
        EspecialidadeMedica cirurgia = cirurgiaFactory.criarEspecialidadeMedica();
        sistema.tratarPaciente(cirurgia);

        HospitalFactory cardiologiaFactory = new CardiologistaFactory();
        EspecialidadeMedica cardiologia = cardiologiaFactory.criarEspecialidadeMedica();
        sistema.tratarPaciente(cardiologia);

        HospitalFactory oftalmologiaFactory = new OftalmologistaFactory();
        EspecialidadeMedica oftalmologia = oftalmologiaFactory.criarEspecialidadeMedica();
        sistema.tratarPaciente(oftalmologia);
    }
}
