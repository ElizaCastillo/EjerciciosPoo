public class Entrenador extends Persona {
    private String federacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String federacion) {
        super(id, nombre, apellidos, edad);
        this.federacion = federacion;
    }

    public String getFederacion() { return federacion; }
    public void setFederacion(String federacion) { this.federacion = federacion; }

    @Override
    public void realizarTarea() {
        System.out.println(nombre + " está dirigiendo un partido.");
    }
}
