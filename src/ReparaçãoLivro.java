import java.time.LocalDate;
import java.util.ArrayList;

public class ReparaçãoLivro {

    private EnvioLivros envioLivros;
    private LocalDate data_inicio;

    public EnvioLivros getEnvioLivros() {
        return envioLivros;
    }

    public void setEnvioLivros(EnvioLivros envioLivros) {
        this.envioLivros = envioLivros;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public ReparaçãoLivro(EnvioLivros envioLivros, LocalDate data_inicio) {
        this.envioLivros = envioLivros;
        this.data_inicio = data_inicio;
    }
}
