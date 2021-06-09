package uaslp.objetos.escuela;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }

    @Test
    public void validarMetodoCubir_CuandoAyBSonIguales_entoncesGuardamosCadenaC(){
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmo = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        //when
        int var = 5;
        algoritmo.algoritmoACubrir(var,var,"cadena C");

        //then
        verify(dependencia1, times(1)).save("cadena C");

    }

    @Test
    public void validarMetodoCubir_CuandoAEsMenorQueB_entoncesLlamammosAMetodoPrint(){
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmo = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        //when

        algoritmo.algoritmoACubrir(3, 5,"cadena C");

        //then
        verify(dependencia2, times(1)).print(3, "cadena C");

    }

    @Test
    public void validarMetodoCubir_CuandoAEsMayorQueB_entoncesLlamamosMetodoSendYVerificamosMetodoRecover(){
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmo = new AlgoritmoX(dependencia1,dependencia2,dependencia3);

        //when
        algoritmo.algoritmoACubrir(7,4,"cadena C");

        //then
        verify(dependencia3, times(1)).send(7, 4);
        verify(dependencia3, times(1)).recover();

    }
}
