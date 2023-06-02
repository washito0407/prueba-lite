public class metodolib {


    String nombre;
    int anio;
    String autor;

    public metodolib (String nombre, int anio, String autor) {
        this.nombre = nombre;
        this.anio = anio;
        this.autor = autor;
    }
    public void mostrar(){
        System.out.println("El libro es: " + nombre);
        System.out.println("El año del libro es: "+ anio);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("   ");
    }
}
