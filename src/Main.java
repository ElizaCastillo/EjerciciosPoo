public class Main {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Hector", "Fort", 36, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Carlos", "Martines", 52, "FED123");
        Masajista masajista = new Masajista(3, "Ana", "Pérez", 45, "Masajista", 20);

        System.out.println("Futbolista: " + futbolista.getNombre() + " " + futbolista.getApellidos());
        System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellidos());
        System.out.println("Masajista: " + masajista.getNombre() + " " + masajista.getApellidos());


        // Acciones comunes
        futbolista.concentrarse();
        entrenador.viajar();
        masajista.concentrarse();

        // Acciones específicas
        futbolista.jugarpartido();
        entrenador.dirigirentrenamiento();
        masajista.darmasaje();
    }
}