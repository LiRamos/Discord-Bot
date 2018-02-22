
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import javax.security.auth.login.LoginException;
public class Connecting {
	public static void main (String[] args) {	
	JDA discord = null; //Creates a new JDA object.
		try {
		discord = new JDABuilder(AccountType.BOT).setToken(TodorokisToken.Hero).buildBlocking(); //creates a new bot builder, setting a reference for the token.
	} catch (LoginException e) { //Catches and logs bot log in errors.
		e.printStackTrace();
	} catch (IllegalArgumentException e) { //Logs any illegal argument made. 
		e.printStackTrace();
	} catch (InterruptedException e) { //Logs interruptions that occur in the program's threads.
		e.printStackTrace();
	} catch (RateLimitedException e) {//Logs instances of too many executions being done within a 24 hour period.
		e.printStackTrace();
	}
	discord.addEventListener(new TodorokisResponses()); //Adds a listener which looks at Discord user's input, and if it matches one of Broodoroki's commands, that command will 
	}
}
