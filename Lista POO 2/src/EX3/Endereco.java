package EX3;


public class Endereco {
    private String logradouro;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String ConsultaLogradouro() {
        return logradouro;
    }

    public String toString() {
        return "Endereco:\n"
        + "Logradouro: " + logradouro
        + "\n" + cidade 
        + " - "
        + estado;
    }
}
