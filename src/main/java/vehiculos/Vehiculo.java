package vehiculos;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected float velocidadMaxima;
    protected String nombre;
    protected float precio;
    protected float peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int CantidadVehiculos;
    protected static int CantidadAutomoviles;
    protected static int CantidadCamiones;
    protected static int CantidadCamionetas;

    public Vehiculo() {
        CantidadVehiculos++;
    }

    public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
        this();
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        this.sumarVentas();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }


    public static String vehiculosPorTipo() {
        return  "Automoviles: " + CantidadAutomoviles + "\nCamionetas: " + CantidadCamionetas + "\nCamiones: " + CantidadCamiones;
    }

    private void sumarVentas() {
        if (this.fabricante != null) {
            this.fabricante.sumarVentas();
            if (this.fabricante.getPais() != null) {
                this.fabricante.getPais().sumarVentas();
            }
        }
    }
}
