public class ConfiguracionApp {

    private static int vecesCargada = 0;

    // Unica instancia compartida por toda la aplicacion
    private static ConfiguracionApp instancia;

    private double tarifaBase;
    private double valorPorKm;
    private double recargoLluvia;

    // Constructor privado: nadie fuera de la clase puede hacer new
    private ConfiguracionApp() {
        // Simula leer config.properties del disco (operacion lenta y costosa)
        vecesCargada++;
        System.out.println("   >> Leyendo config.properties... (carga #" + vecesCargada + ")");
        this.tarifaBase = 4500;
        this.valorPorKm = 800;
        this.recargoLluvia = 0;
    }

    public static synchronized ConfiguracionApp getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionApp();
        }
        return instancia;
    }

    public double getTarifaBase()    { return tarifaBase; }
    public double getValorPorKm()    { return valorPorKm; }
    public double getRecargoLluvia() { return recargoLluvia; }

    public void setRecargoLluvia(double recargoLluvia) {
        this.recargoLluvia = recargoLluvia;
    }
}
