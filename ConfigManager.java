public class ConfigManager{
    private static ConfigManager instance;
    private String idioma;
    private String tema;
    private boolean modoEscuro;

    private ConfigManager(){

    }

    public static ConfigManager getInstance(){
        if(instance == null){
            return new ConfigManager();
        }
        return instance;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public void setModoEscuro(boolean trueOrFalse){
        this.modoEscuro = trueOrFalse;
    }

    public String getIdioma(){
        return this.idioma;
    }

    public String getTema(){
        return this.tema;
    }

    public boolean getModoEscuro(){
        return this.modoEscuro;
    }

    public void ShowConfigs(){
        
        System.out.println("Idioma: " + idioma);
        System.out.println("Tema: " + tema);
        System.out.println("Modo Escuro: " + modoEscuro);
        
    }

}