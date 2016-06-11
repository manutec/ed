/**
 * Esta clase se usará para guardar y mostrar datos para una empresa de inmuebles
 */
package propertyshop;

/**
 *
 * @author Manuel Izquierdo Herrero
 */
public class Property {

    private String name;
    private String address;
    private Double surface, availableSurface;
    private String owner, ownerAddress;
    private int price;

    /**
     * Método usado para especificar el nombre del inmueble
     *
     * @param nName cadena que define el nombre del inmueble
     */
    public void setName(String nName) {
        name = (nName == null) ? null : nName.toLowerCase();
    }

    /**
     * Método que devuelve el nombre del inmueble en letras minusculas.
     *
     * @return Nombre del inmueble.
     */
    public String getName() {
        return name;
    }

    /**
     * Método para especificar la dirección del inmueble.
     *
     * @param nAddress cadena con la dirección
     */
    public void setAddress(String nAddress) {
        address = (nAddress == null) ? null : nAddress.toUpperCase();
    }

    /**
     * Método que devolverá la dirección del inmueble en letras mayusculas.
     *
     * @return Dirección del inmueble.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Método para especificar la superficie construida del inmueble siempre
     * mayor a cero.
     *
     * @param nSurface Metros de superficie construida.
     */
    public void setConstructedSurface(double nSurface) {
        try {
            if (nSurface > 0) {
                surface = nSurface;
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al introducir los datos. " + e);
        }
    }

    /**
     * Devolverá la superficie construida.
     *
     * @return Superficie construida
     */
    public double getConstructedSurface() {
        return surface;
    }

    /**
     * Especifica la superficie disponible del inmueble siempre mayor a 0.
     *
     * @param navailableSurface Metros de superficie disponible
     */
    public void setAvailableSurface(double navailableSurface) {
        try {
            if (navailableSurface > 0) {
                availableSurface = navailableSurface;
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al introducir los datos. " + e);
        }
    }

    /**
     * Devolverá la superficie disponible.
     *
     * @return Metros superficie disponible.
     */
    public Double getAvailableSurface() {
        return availableSurface;
    }

    /**
     * Especifica el propietario del inmueble
     *
     * @param nOwner Propietario del inmueble
     */
    public void setOwner(String nOwner) {
        owner = (nOwner == null) ? null : nOwner;
    }

    /**
     * Devolverá el propietario del inmueble.
     *
     * @return Propietario del inmueble.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Especifica la dirección del propietario del inmueble.
     *
     * @param nOwnerAddress dirección del propietario del inmueble
     */
    public void setOwnerAddress(String nOwnerAddress) {
        ownerAddress = nOwnerAddress;
    }

    /**
     * Devolverá la dirección del propietario del inmueble.
     *
     * @return Direccion del propietario del inmueble.
     */
    public String getOwnerAddress() {
        return ownerAddress;
    }

    /**
     * Especifica el precio del inmueble siempre mayor a cero.
     *
     * @param nPrice Precio del inmueble.
     */
    public void setPrice(int nPrice) {
        try {
            if (nPrice > 0) {
                price = nPrice;
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al introducir los datos. " + e);
        }
    }

    /**
     * Devolverá el precio del inmueble.
     *
     * @return Precio del inmueble.
     */
    public int getPrice() {
        return price;
    }

}
