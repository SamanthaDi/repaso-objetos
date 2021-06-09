package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas {
    private static SalaDeJuntasA uniqueInstance;

    public static SalaDeJuntasA getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasA();
        return uniqueInstance;
    }

    public String getNombre() {
        return "Sala A";
    }
}
