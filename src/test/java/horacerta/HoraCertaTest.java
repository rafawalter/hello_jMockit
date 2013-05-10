package horacerta;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import mockit.NonStrictExpectations;
import mockit.Mocked;

public class HoraCertaTest {

    @Test()
    public void deveObterHoraCerta() {
        String horaCerta = new HoraCerta().obterHora();
        assertEquals("10:10", horaCerta);
    }


    @Test()
    public void deveDarAcertarHora() {
        HoraCerta horaCerta = new HoraCerta();
        horaCerta.acertarHora();
        assertEquals("12:12", horaCerta.obterHora());
    }


    @Test(expected = IOException.class)
    public void deveDarErroAoAcertarHora() {
        new NonStrictExpectations() {
            @Mocked RelogioNaInternet relogioMock;
            {
                relogioMock.obterHoraCerta(); result = new IOException();
            }
        };

        new HoraCerta().acertarHora();
    }

}
