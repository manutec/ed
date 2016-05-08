package ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class CalendarioVacuna {
    
    private Enfermedad[] Enfermedad;
    public List<Enfermedad> lista = new ArrayList<>();

    public List<Enfermedad> getLista() {
        return lista;
    }

    public void setLista(List<Enfermedad> lista) {
        this.lista = lista;
    }

    
    Enfermedad[] getEnfermedad() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Enfermedad;
    }

    
    void setEnfermedad(Enfermedad[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Enfermedad = value;
    }

}
