import java.util.ArrayList;
public class Caja<T>{
    private T contenido;

    public Caja(T contenido)
    {
        this.contenido = contenido;
    }
    public void guardar(T item)
    {
       contenido = item;
    }

    public T obtener()
    {
        return contenido;
    }
    public void mostrarInfo()
    {
        System.out.println("el/ los objetos contenidos son: " + contenido);
    }

    public static void main(String[] args){
        Caja<Integer> contenido1 = new Caja<>(2);
        Caja<String> contenido2 = new Caja<>("hola");
        Person persona = new Person("priscila", "urbano", 46454677);
        Caja<Person> contenido3 = new Caja<>(persona);
        
        contenido1.mostrarInfo();
        contenido2.mostrarInfo();
        contenido3.mostrarInfo();

        Integer num = contenido1.obtener();
        String texto = contenido2.obtener();
        Person p = contenido3.obtener();
        
        System.out.println(p.toString());
       
        ArrayList<Caja<?>> lista = new ArrayList<>();
        lista.add(contenido1);
        lista.add(contenido2);
        lista.add(contenido3);

        System.out.println("\nContenido de la lista de cajas:");
        for (Caja<?> c : lista) {
            c.mostrarInfo();
        }
    }
}