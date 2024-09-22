import java.time.LocalTime;
import java.time.Duration;
import java.util.Date;

public class CheckIn {
    private Funcionario funcionario;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private Date data;

    public CheckIn(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.data = new Date();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setHoraEntrada(Integer hora, Integer min) {
        this.horaEntrada = LocalTime.of(hora, min);
    }
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraSaida(Integer hora, Integer min) {
        this.horaSaida = LocalTime.of(hora, min);
    }
    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public Date getData() {
        return data;
    }

    public String calcHorasTrabalhadas() {
        if (horaEntrada != null && horaSaida != null) {
            Duration duracao = Duration.between(this.horaEntrada, this.horaSaida);
            long horas = duracao.toHours();
            long minutos = duracao.toMinutesPart();
            return String.format("%02d:%02d", horas, minutos);  // Formata com 2 dígitos
        }
        else {
            return "Horas de entrada ou saída não foram registradas.";
        }
    }

}
