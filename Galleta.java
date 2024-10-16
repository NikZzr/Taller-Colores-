public class Galleta {
  
    private String sabor;
    private double peso;
    private String marca;
    private int cantidadAzucar;
    private boolean esRellena;
    
    
    public Galleta(String sabor, double peso, String marca, int cantidadAzucar, boolean esRellena) {
        this.sabor = sabor;
        this.peso = peso;
        this.marca = marca;
        this.cantidadAzucar = cantidadAzucar;
        this.esRellena = esRellena;
    }
    
    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean isEsRellena() {
        return esRellena;
    }

    public void setEsRellena(boolean esRellena) {
        this.esRellena = esRellena;
    }

    
    public void comer() {
        System.out.println("Estás comiendo una deliciosa galleta.");
    }

    public void agregarAzucar(int extra) {
        this.cantidadAzucar += extra;
    }

    public void romper() {
        System.out.println("La galleta se ha roto.");
    }

    public void hornear() {
        System.out.println("La galleta se está horneando.");
    }

    public void empacar() {
        System.out.println("La galleta ha sido empacada.");
    }
}

