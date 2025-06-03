import java.util.Random;
import java.util.ArrayList; // Importa la clase Random

/**
 * La clase RandomTester proporciona métodos para probar la generación de números aleatorios.
 * * @author Priscila Urbano  
 * @version 1.0
 */
public class RandomTester
{
    // Una instancia de la clase Random que se usará para generar números aleatorios
    private Random generador;//i can choose the name that i want for de variable, but the type of the varaible is the name of the colection but in the world of the programming ys very important use names related with the topic.

  /**
     * Constructor para objetos de la clase RandomTester.
     * Inicializa el generador de números aleatorios.
     */
    public RandomTester()
    {
        generador = new Random(); // Crea una nueva instancia de Random
    }

    /**
     * Imprime un único número entero aleatorio.
     * El número generado estará en el rango de 0 (inclusive) a 99 (inclusive).
     */
    public void printOneRandom()
    {
        // Genera un número entero aleatorio entre 0 y 99 (100 números posibles)
        int numeroAleatorio = generador.nextInt(100); 
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }

    /**
     * Imprime una cantidad especificada de números enteros aleatorios.
     * Cada número generado estará en el rango de 0 (inclusive) a 99 (inclusive).
     * * @param howMany La cantidad de números aleatorios a imprimir.
     */
    public void printMultiRandom(int howMany)
    {
        if (howMany <= 0) {
            System.out.println("La cantidad de números a generar debe ser mayor que cero.");
            return; // Sale del método si howMany no es válido
        }
        
        System.out.println("Generando " + howMany + " números aleatorios:");
        for (int i = 0; i < howMany; i++) {
            int numeroAleatorio = generador.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);
        }
    }
    public void throwDice()
    {
      int dado = generador.nextInt(6) + 1;
      System.out.println("el numero que te toco al lanzar el dado es......" + dado);
    }
    public String getResponse()
    {
        // 1. Crear un ArrayList para almacenar las posibles respuestas.
        // La notación de diamante <String> indica que esta lista contendrá objetos String.
        ArrayList<String> respuestas = new ArrayList<>(); 

        // 2. Añadir las respuestas deseadas al ArrayList.
        respuestas.add("yes");
        respuestas.add("no");
        respuestas.add("maybe");
        respuestas.add("perhaps"); 
        respuestas.add("definitely");
        respuestas.add("absolutly");

        // 3. Obtener el número total de respuestas disponibles.
        // El método size() devuelve la cantidad de elementos en el ArrayList.
        int cantidadRespuestas = respuestas.size(); 

        // 4. Generar un índice aleatorio.
        // El número estará entre 0 (inclusive) y 'cantidadRespuestas' (exclusive).
        // Por ejemplo, si 'cantidadRespuestas' es 5, nextInt(5) generará 0, 1, 2, 3 o 4.
        int indiceAleatorio = generador.nextInt(cantidadRespuestas); 

        // 5. Obtener la respuesta que está en la posición del índice aleatorio.
        // El método get(indice) devuelve el elemento en esa posición del ArrayList.
        String respuestaSeleccionada = respuestas.get(indiceAleatorio);
        
        // Imprime la respuesta en la consola para que la veas.
        System.out.println("La respuesta aleatoria es: " + respuestaSeleccionada);
        
        // Devuelve la cadena seleccionada aleatoriamente.
        return respuestaSeleccionada; 
    }
    public String getChoiceTwo()
    {
        // Genera un número aleatorio entre 0 (inclusive) y 3 (exclusive),
        // es decir, 0, 1, o 2.
        int eleccionNumerica = generador.nextInt(3); 
        String resultado;

        // Mapeamos el número a una de las cadenas
        if (eleccionNumerica == 0) {
            resultado = "yes";
        } else if (eleccionNumerica == 1) {
            resultado = "no";
        } else { // eleccionNumerica == 2
            resultado = "maybe";
        }
        
        System.out.println("La elección aleatoria es: " + resultado);
        return resultado; // Devuelve la cadena elegida
    } 
/**
     * Genera y devuelve un número entero aleatorio entre 1 (inclusive) y 'max' (inclusive).
     * Esto es útil para simular dados de diferentes caras o rangos personalizados.
     * @param max El valor máximo que el número aleatorio puede tomar (inclusive).
     * @return Un número entero aleatorio entre 1 y 'max'. Devuelve -1 si 'max' es inválido.
     */
    public int generateRandomNumber(int max)
    {
        // Validamos que 'max' sea al menos 1, ya que no tiene sentido generar números hasta 0 o menos.
        if (max <= 0) {
            System.out.println("El valor 'max' debe ser al menos 1 para generar un número aleatorio.");
            return -1; // Devolvemos un valor de error o podrías lanzar una excepción
        }
        
        // generador.nextInt(max) genera un número entre 0 (inclusive) y 'max' (exclusive).
        // Para incluir 'max', necesitamos nextInt(max) + 1.
        // Por ejemplo, si max es 6, nextInt(6) da 0-5. Al sumar 1, obtenemos 1-6.
        int randomNumber = generador.nextInt(max) + 1;
        
        System.out.println("Número aleatorio generado entre 1 y " + max + ": " + randomNumber);
        return randomNumber; // Devolvemos el número generado
    }
 /**
     * Genera y devuelve un número entero aleatorio comprendido entre un valor mínimo (min)
     * y un valor máximo (max), ambos inclusive.
     * Este método es versátil y admite rangos que incluyan números positivos, negativos o cero.
     * * @param min El valor mínimo (inclusive) del rango. Puede ser positivo, negativo o cero.
     * @param max El valor máximo (inclusive) del rango. Puede ser positivo, negativo o cero.
     * @return Un número entero aleatorio dentro del rango [min, max]. Devuelve -1 si los parámetros son inválidos.
     */
    public int generateNumber(int min, int max)
    {
        // 1. Validación de parámetros: Asegúrate de que 'min' no sea mayor que 'max'.
        if (min > max) {
            System.out.println("Error: El valor mínimo (" + min + ") no puede ser mayor que el valor máximo (" + max + ").");
            return -1; // Indica un error
        }
        // 2. Calcular el tamaño del rango de valores posibles.
        // La cantidad de números en el rango [min, max] es (max - min + 1).
        // Ej: min= -5, max=5. Rango = 5 - (-5) + 1 = 5 + 5 + 1 = 11 números.
        int rango = max - min + 1;
        // 3. Generar un número aleatorio entre 0 (inclusive) y 'rango' (exclusive).
        // Este número representa un "desplazamiento" dentro de nuestro rango.
        int numeroAleatorioOffset = generador.nextInt(rango);
        // 4. Ajustar el número aleatorio sumándole el valor 'min'.
        // Esto desplaza el número desde el rango [0, rango-1] al rango deseado [min, max].
        // Ej: Si min=-5 y numeroAleatorioOffset fue 0, el resultado es -5.
        // Ej: Si min=-5 y numeroAleatorioOffset fue 10, el resultado es 5.
        int numeroFinal = numeroAleatorioOffset + min;
        System.out.println("Número aleatorio generado entre " + min + " y " + max + ": " + numeroFinal);
        return numeroFinal; // Devuelve el número generado
    }
    /**public int generateNumber(int min, int max) 
    {
      if (min <= 0 && max<=0) {
          System.out.println("los valores ingresados deben ser al menos 1");
          return -1;
      }
      int randomNumber = generador.nextInt(min,max);
      System.out.println("el numero generado es " + randomNumber);
      return randomNumber; 
    }*/
}