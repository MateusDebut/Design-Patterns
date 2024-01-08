package medicos.factory;

import medicos.Cirurgiao;
import medicos.EspecialidadeMedica;

public class CirurgiaoFactory implements HospitalFactory{
    @Override
    public EspecialidadeMedica criarEspecialidadeMedica() {
        return new Cirurgiao();
    }
}
