package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas {
    private static SalaDeJuntasB uniqueInstance;

    public static SalaDeJuntasB getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new SalaDeJuntasB();
        return uniqueInstance;
    }

    public String getNombre() {
        return "Sala B";
    }
}
