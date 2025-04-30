public class Main{
    public static void main(String[] args){
        ConfigManager configure = ConfigManager.getInstance();
        configure.setIdioma("Português");
        configure.setTema("Flores");
        configure.setModoEscuro(true);
        configure.ShowConfigs();;
    }
}