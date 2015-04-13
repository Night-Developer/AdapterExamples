package org.blashadow.adapterexample;

/**
 * Created by blashadow on 4/12/15.
 */
public class Evento {
    private String titulo;
    private String detalles;

    public Evento(String titulo, String detalles) {
        this.titulo = titulo;
        this.detalles = detalles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
