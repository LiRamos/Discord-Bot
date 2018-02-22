import java.util.Random;
import javax.xml.bind.Marshaller;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class TodorokisResponses extends ListenerAdapter {
public void onMessageReceived(MessageReceivedEvent event){
	String message = event.getMessage().getContent();
	if (message.startsWith("b!hi")){ //Gets content of a user's message, which must start with this.
		String name = event.getAuthor().getName(); //gets name of author
		String response ="Hello" + " " + name + ", " +  "need something?";
		event.getTextChannel().sendMessage(response).complete();
		}
	if (message.startsWith("b!brofist")){
		String name = event.getAuthor().getName();
		String response ="*brofists" + " " + name + "*";
		event.getTextChannel().sendMessage(response).complete();
	}
	if (message.startsWith("b!headpat")){
		String name = event.getAuthor().getName();
		String response ="*pats" + " " + name + "'s head*";
		event.getTextChannel().sendMessage(response).complete();
	}
	if (message.startsWith("b!ping")){
		String name = event.getAuthor().getName();
		String response ="I'm here," + " " + name;
		event.getTextChannel().sendMessage(response).complete();
	}
	if (message.startsWith("b!roll")){
		String name = event.getAuthor().getName();
		Random rand = new Random();
		int roll = rand.nextInt(6) + 1;
		String response ="You rolled a" + " " + roll;
		event.getTextChannel().sendMessage(response).complete();
	}
	
}	

}
