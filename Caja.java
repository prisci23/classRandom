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
        Person persona = new Person("pricila", "urbano", 46454677);
        Caja<Person> contenido3 = new Caja<>(persona);
        
        contenido1.mostrarInfo();
        contenido2.mostrarInfo();
        contenido3.mostrarInfo();

        contenido1.obtener();
        contenido2.obtener();
        contenido3.obtener();
        
        //ArrayList<Caja<?>>

    }
}