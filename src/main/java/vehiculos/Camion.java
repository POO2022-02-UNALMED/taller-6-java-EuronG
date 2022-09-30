package vehiculos;

public class Camion extends Vehiculo{

    protected int ejes;

    public Camion() {
        this.puertas = 2;
        this.velocidadMaxima = 80;
        this.traccion = "4X2";
        super.CantidadCamiones++;
    }

    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        super.CantidadCamiones++;
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(byte ejes) {
        this.ejes = ejes;
    }
}
