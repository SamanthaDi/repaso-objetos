package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas {
    private static SalaDeJuntasC uniqueInstance;

    public static SalaDeJuntasC getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasC();
        return uniqueInstance;
    }

    public String getNombre() {
        return "Sala C";
    }
}
