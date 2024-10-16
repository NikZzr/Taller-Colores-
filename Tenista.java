public class Tenista {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private int rankingMundial;
    private int titulosGanados;

 
    public Tenista(String nombre, int edad, String nacionalidad, int rankingMundial, int titulosGanados) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.rankingMundial = rankingMundial;
        this.titulosGanados = titulosGanados;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getRankingMundial() {
        return rankingMundial;
    }

    public void setRankingMundial(int rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public int getTitulosGanados() {
        return titulosGanados;
    }

    public void setTitulosGanados(int titulosGanados) {
        this.titulosGanados = titulosGanados;
    }


    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    public void competir() {
        System.out.println(nombre + " está compitiendo en un torneo.");
    }

    public void ganarTitulo() {
        this.titulosGanados++;
        System.out.println(nombre + " ha ganado un nuevo título.");
    }

    public void viajar() {
        System.out.println(nombre + " está viajando para jugar en un torneo.");
    }

    public void descansar() {
        System.out.println(nombre + " está descansando después de un torneo.");
    }
}
