public class Main {
    public static void main(String[] args) {
        Futbolista f = new Futbolista(1, "Carlos", "Pérez", 25, 10, "Delantero");
        f.realizarTarea();

        Entrenador e = new Entrenador(2, "Luis", "Martínez", 50, "Federación Española");
        e.realizarTarea();

        Masajista m = new Masajista(3, "Ana", "López", 40, "Fisioterapia", 15);
        m.realizarTarea();
    }
}
