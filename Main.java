public class Main {
    public static void main(String[] args) {
    
        Galleta galleta = new Galleta("Chocolate", 50.0, "Oreo", 10, true);
        Saturno saturno = new Saturno(120536, 82, true, 1.429e9, "Hidrógeno y Helio");
        Tenista tenista = new Tenista("Rafael Nadal", 37, "España", 2, 20);
        
      
        System.out.println("Sabor de la galleta: " + galleta.getSabor());
        System.out.println("Número de lunas de Saturno: " + saturno.getNumeroLunas());
        System.out.println("Nombre del tenista: " + tenista.getNombre());
    }
}
