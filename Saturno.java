public class Saturno {
   
    private double diametro;
    private int numeroLunas;
    private boolean tieneAnillos;
    private double distanciaAlSol;
    private String composicion;


    public Saturno(double diametro, int numeroLunas, boolean tieneAnillos, double distanciaAlSol, String composicion) {
        this.diametro = diametro;
        this.numeroLunas = numeroLunas;
        this.tieneAnillos = tieneAnillos;
        this.distanciaAlSol = distanciaAlSol;
        this.composicion = composicion;
    }

 
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public int getNumeroLunas() {
        return numeroLunas;
    }

    public void setNumeroLunas(int numeroLunas) {
        this.numeroLunas = numeroLunas;
    }

    public boolean isTieneAnillos() {
        return tieneAnillos;
    }

    public void setTieneAnillos(boolean tieneAnillos) {
        this.tieneAnillos = tieneAnillos;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    // Métodos adicionales
    public void girar() {
        System.out.println("Saturno está girando sobre su eje.");
    }

    public void orbitar() {
        System.out.println("Saturno está orbitando alrededor del sol.");
    }

    public void mostrarAnillos() {
        if (tieneAnillos) {
            System.out.println("Saturno está mostrando sus anillos.");
        } else {
            System.out.println("Saturno no tiene anillos visibles.");
        }
    }

    public void cambiarLunas(int nuevasLunas) {
        this.numeroLunas = nuevasLunas;
    }

    public void aumentarDistancia(double km) {
        this.distanciaAlSol += km;
    }
}
