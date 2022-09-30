package vehiculos;

public class Camioneta extends Vehiculo{

    Boolean volco;

    public Camioneta() {
        this.velocidadMaxima = 90;
        this.traccion = "4X4";
        super.CantidadCamionetas++;
    }

    public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        super.CantidadCamionetas++;
        this.volco = volco;
    }

    public Boolean isVolco() {
        return volco;
    }

    public void setVolco(Boolean volco) {
        this.volco = volco;
    }
}
