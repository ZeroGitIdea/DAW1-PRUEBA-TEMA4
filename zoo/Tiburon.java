package zoo;

/**
 * La clase Tiburon representa a un tipo de pez específico: el tiburón.
 * Extiende la clase Pez y proporciona funcionalidades específicas para un tiburón.
 */
public class Tiburon extends Pez {
    private String especie; // Especie del tiburón
    private boolean peligroso; // Indica si el tiburón es peligroso o no
    private static int numTiburones = 0; // Contador de la cantidad de tiburones creados

    /**
     * Constructor por defecto de la clase Tiburon.
     * Crea un tiburón con características predeterminadas.
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor de la clase Tiburon que permite especificar ciertas características.
     * @param especie La especie del tiburón.
     * @param peligroso Indica si el tiburón es peligroso o no.
     * @param velocidadMaxNatacion La velocidad máxima de natación del tiburón.
     * @param tipo El tipo de pez al que pertenece el tiburón.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor de la clase Tiburon que permite especificar todas las características.
     * @param especie La especie del tiburón.
     * @param peligroso Indica si el tiburón es peligroso o no.
     * @param velocidadMaxNatacion La velocidad máxima de natación del tiburón.
     * @param tipo El tipo de pez al que pertenece el tiburón.
     * @param habitat El hábitat del tiburón.
     * @param comida El tipo de comida del tiburón.
     * @param longevidad La longevidad del tiburón.
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Método para que el tiburón se desplace.
     * Imprime un mensaje indicando la velocidad de natación del tiburón.
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Método para que el tiburón coma.
     * Imprime un mensaje indicando el tipo de comida que está comiendo el tiburón.
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Método de finalización que decrementa el contador de tiburones al ser destruido.
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}

