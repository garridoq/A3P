package pkg_command;
import pkg_core.GameEngine;


/**
 * Write a description of class HelpCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelpCommand extends Command 
{
    private CommandWords aCommandWords;
    /**
     * Constructeur de la classe HelpCommand
     * @param pCommandWords mot de commande associé
     */
    public HelpCommand(final CommandWords pCommandWords)
    {
        super(null);
        this.aCommandWords = pCommandWords;
    }//Constructeur()
    /** 
     * affiche le message d'aide
     * @param pGameEngine GameEngine qui éxécutera la commande
     */
    @Override
    public void execute(final GameEngine pGameEngine)
    {
        pGameEngine.getGUI().println("Vous êtes seul et perdu. \nVous vous trouvez dans la montagne sacrée du Bahamut.\n");
        pGameEngine.getGUI().println("Your command words are : " + this.aCommandWords.getCommandList() + "\n");
    }//execute
}
