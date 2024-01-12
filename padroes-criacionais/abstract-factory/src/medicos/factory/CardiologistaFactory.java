package medicos.factory;

import medicos.Cardiologista;
import medicos.EspecialidadeMedica;

public class CardiologistaFactory implements HospitalFactory{
    @Override
    public EspecialidadeMedica criarEspecialidadeMedica() {
        return new Cardiologista();
    }
}
