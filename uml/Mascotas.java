package ejercicio14;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mascotas {

    private String Codigo;
    private String Alias;
    private String Especie;
    private String Raza;
    private String ColorPelo;
    private Date FechaNaz;
    private float[] Peso = new float[10];
    private float PesoActual;

    public List<Enfermedad> getLenfermedad() {
        return lenfermedad;
    }

    public void setLenfermedad(List<Enfermedad> lenfermedad) {
        this.lenfermedad = lenfermedad;
    }

    public CalendarioVacuna getVac() {
        return vac;
    }

    public void setVac(CalendarioVacuna vac) {
        this.vac = vac;
    }
    public List<Enfermedad> lenfermedad = new ArrayList<> ();
    public CalendarioVacuna vac;


    String getCodigo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Codigo;
    }

 
    void setCodigo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Codigo = value;
    }

  
    String getAlias() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Alias;
    }

    void setAlias(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Alias = value;
    }

    String getEspecie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Especie;
    }

    void setEspecie(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Especie = value;
    }


    String getRaza() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Raza;
    }


    void setRaza(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Raza = value;
    }


    String getColorPelo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ColorPelo;
    }

    void setColorPelo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ColorPelo = value;
    }


    float[] getPeso() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Peso;
    }


    void setPeso(float[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Peso = value;
    }


    Date getFechaNaz() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.FechaNaz;
    }

    void setFechaNaz(Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.FechaNaz = value;
    }


    float getPesoActual() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PesoActual;
    }

    void setPesoActual(float value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PesoActual = value;
    }

}
