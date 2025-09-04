public class Constructor {
    private String nombre;
    private String ocupacion;

    public Constructor(String nombre, String ocupacion) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }
}
