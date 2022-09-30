package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    String nombre;
    Pais pais;
    public int ventas;
    static ArrayList<Fabricante> listado;

    public Fabricante() {
        if (listado == null) {
            listado = new ArrayList<>();
        }
        listado.add(this);
    }

    public Fabricante(String nombre, Pais pais) {
        this();
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public void sumarVentas() {this.ventas++;}

    public static Fabricante fabricaMayorVentas() {
        Fabricante max = listado.get(0);
        for (int i = 1; i < listado.size(); i++) {
            if (listado.get(i).ventas > max.ventas) {
                max = listado.get(i);
            }
        }
        return max;
    }
}
