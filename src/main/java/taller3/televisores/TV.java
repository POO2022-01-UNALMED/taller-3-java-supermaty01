package taller3.televisores;

public class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private static int numTV;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public static int getNumTV() {
        return numTV;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 && this.estado) {
            this.canal = canal;
        }
    }

    public void canalUp() {
        if (this.canal < 120 && this.estado) {
            this.canal++;
        }
    }

    public void canalDown() {
        if (this.canal > 1 && this.estado) {
            this.canal--;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 7 && this.estado) {
            this.volumen = volumen;
        }
    }

    public void volumenUp() {
        if (this.volumen < 7 && this.estado) {
            this.volumen++;
        }
    }

    public void volumenDown() {
        if (this.volumen > 0 && this.estado) {
            this.volumen--;
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

}
