package vehiculos;

import java.util.ArrayList;

public class Pais {

    protected String nombre;
    public int ventas;
    public static ArrayList<Pais> listado;

    public Pais() {
        if (listado == null) {
            listado = new ArrayList<>();
        }
        listado.add(this);
    }

    public Pais(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void sumarVentas() {
        this.ventas ++;
    }

    public static Pais paisMasVendedor() {
        Pais max = listado.get(0);
        for (int i = 1; i < listado.size(); i++) {
            if (listado.get(i).ventas > max.ventas) {
                max = listado.get(i);
            }
        }
        return max;
    }
}
