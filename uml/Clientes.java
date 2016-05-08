package ejercicio14;
import java.util.ArrayList;
import java.util.List;

public class Clientes {
    
    private String Codigo;
    private String Apellido;
    private String CuentaBanco;
    private String Direccion;
    private int Telefono;

    public List<Persona> persona  = new ArrayList<> ();

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> lista) {
        this.persona = lista;
    }

    public List<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    
    public List<Mascotas> mascotas = new ArrayList<> ();

    
    String getCodigo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Codigo;
    }

    
    void setCodigo(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Codigo = value;
    }

    String getApellido() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Apellido;
    }

    void setApellido(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Apellido = value;
    }

    String getCuentaBanco() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.CuentaBanco;
    }

    void setCuentaBanco(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.CuentaBanco = value;
    }


    String getDireccion() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Direccion;
    }

    void setDireccion(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Direccion = value;
    }

    int getTelefono() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Telefono;
    }

    void setTelefono(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Telefono = value;
    }

   

}
