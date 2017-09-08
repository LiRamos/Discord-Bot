import javax.xml.bind.Marshaller;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class TodorokisResponses extends ListenerAdapter {
public void onMessageReceived(MessageReceivedEvent event){
	
	String message = event.getMessage().getContent();
	if (message.startsWith("b!hi")){
		String name = event.getAuthor().getName();
		String response = name + "Hello, need something?";
		event.getTextChannel().sendMessage(response).queue();
		
	}
}	

}
