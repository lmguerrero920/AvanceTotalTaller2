package vectores.enteros;

public class VectorEntero  {


    public int getCantidadNumeros() {
        return cantidadNumeros;
    }

    public void setCantidadNumeros(int cantidadNumeros) {
        this.cantidadNumeros = cantidadNumeros;
    }


    public int getnNumeros() {
        return nNumeros;
    }

    public void setnNumeros(int nNumeros) {
        this.nNumeros = nNumeros;
    }

    private  int nNumeros;

    private  int cantidadNumeros;


    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    private int cant;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    private int opcion;
}
