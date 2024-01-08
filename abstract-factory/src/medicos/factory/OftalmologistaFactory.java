package medicos.factory;

import medicos.EspecialidadeMedica;
import medicos.Oftalmologista;

public class OftalmologistaFactory implements HospitalFactory{
    @Override
    public EspecialidadeMedica criarEspecialidadeMedica() {
        return new Oftalmologista();
    }
}
