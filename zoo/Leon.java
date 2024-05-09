package zoo;

/**
 * La clase Leon representa a un león, un tipo específico de mamífero.
 * Extiende la clase Mamifero y proporciona funcionalidades específicas para un león.
 */
public class Leon extends Mamifero {
 
    private String rugido = "GRRRRR"; // El rugido del león
    
    /**
     * Constructor por defecto de la clase Leon.
     * Crea un león con rugido predeterminado.
     */
    public Leon () {}
    
    /**
     * Constructor de la clase Leon que permite especificar ciertas características.
     * @param habitat El hábitat del león.
     * @param comida El tipo de comida del león.
     * @param longevidad La longevidad del león.
     * @param periodoLactancia El periodo de lactancia del león.
     */
    public Leon (Habitat habitat, String comida, int longevidad, int periodoLactancia) {
        super(habitat, comida, longevidad, periodoLactancia);
    }
    
    /**
     * Método para establecer el rugido del león.
     * @param rugido El rugido del león.
     */
    public void setRugido (String rugido) { this.rugido = rugido; }
    
    /**
     * Método para obtener el rugido del león.
     * @return El rugido del león.
     */
    public String getRugido () { return rugido; }
    
    /**
     * Método para que el león emita su rugido.
     */
    public void rugir () { System.out.println(rugido); }
    
    /**
     * Método para que el león coma.
     * Imprime un mensaje indicando el tipo de comida que está comiendo el león.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * Método para que el león se desplace.
     * Imprime un mensaje indicando la acción de buscar comida.
     */
    public void desplazar () { System.out.println("Estoy en busca de " + comida); }
}
