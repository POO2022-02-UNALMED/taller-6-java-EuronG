package vehiculos;

public class Automovil extends Vehiculo{

    protected int puestos;

    public Automovil() {
        super.CantidadAutomoviles++;
        this.puertas = 4;
        this.velocidadMaxima = 100;
        this.traccion = "FWD";
    }

    public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        super.CantidadAutomoviles++;
        this.puestos = puestos;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
