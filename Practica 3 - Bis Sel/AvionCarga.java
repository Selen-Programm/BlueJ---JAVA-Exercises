
public class AvionCarga extends Avion {
    // Atributos de la clase AvionCarga
    protected int cargaMaxima;         // Carga máxima que puede llevar el avión
    protected int cargaActual;         // Carga actual que lleva el avión 
    protected int cantidadDeBultos;   // Cantidad de bultos que el avión transporta
    protected int velocidadDeVuelo;   // Velocidad actual del avión

    // Constructor de la clase AvionCarga
    public AvionCarga(int cargaMaxima, int cargaActual, int cantidadDeBultos, int velocidadDeVuelo) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.cantidadDeBultos = cantidadDeBultos;
        this.velocidadDeVuelo = velocidadDeVuelo;
    }

    // Método para cargar bodega
    public void cargarBodega(int valor) {
        // Verificamos si la carga total no supera la carga máxima permitida
        if (cargaActual + valor <= cargaMaxima) {
            cargaActual += valor;  // Aumentamos la carga actual
            cantidadDeBultos += 1; // Incrementamos la cantidad de bultos (suponemos que cada carga es un bulto)
            System.out.println("Se cargaron " + valor + " kilos. Carga total: " + cargaActual + " kilos.");
        } else {
            System.out.println("No se puede cargar más. La carga excede la carga máxima permitida.");
        }
    }

    // Método para descargar bodega
    public void descargarBodega(int valor) {
        // Verificamos que no tratemos de descargar más carga de la que lleva el avión
        if (valor <= cargaActual) {
            cargaActual -= valor;  // Disminuimos la carga actual
            cantidadDeBultos -= 1; // Decrementamos la cantidad de bultos
            System.out.println("Se descargaron " + valor + " kilos. Carga total restante: " + cargaActual + " kilos.");
        } else {
            System.out.println("No se puede descargar más carga de la que lleva el avión.");
        }
    }

    // Método para aumentar la velocidad de vuelo
    public void aumentarVelocidadDeVuelo(int valorAumento) {
        // Solo podemos aumentar la velocidad si la carga es inferior al 80% de la carga máxima
        if (cargaActual < cargaMaxima * 0.8) {
            velocidadDeVuelo += valorAumento;  // Aumentamos la velocidad de vuelo
            System.out.println("La velocidad de vuelo aumentó a " + velocidadDeVuelo + " km/h.");
        } else {
            System.out.println("No se puede aumentar la velocidad. La carga supera el 80% de la carga máxima.");
        }
    }
}

