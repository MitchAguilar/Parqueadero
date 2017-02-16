package parqueaderoconinterfazmejorada;

public class Motos {

    private int placa;
    private int cilindraje;

    public Motos(int placa, int cilindraje) {
        this.placa = placa;
        this.cilindraje = cilindraje;
    }

    //usar el cosntructor para darles valores, !debo pensar en eso....
    public int getplaca() {
        return placa;
    }

    public void setplaca(int placa) {
        this.placa = placa;
    }

    public int getcilindraje() {
        return cilindraje;
    }

    public void setcilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String toString() {
        return '[' + placa + " - " + cilindraje + ']';
    }

}
