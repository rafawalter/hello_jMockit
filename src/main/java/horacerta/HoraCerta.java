package horacerta;

public class HoraCerta {


    private String horaCerta = "10:10";

    public String obterHora() {
        return horaCerta;
    }

    public void acertarHora() {
        horaCerta = new RelogioNaInternet().obterHoraCerta();
    }
}
