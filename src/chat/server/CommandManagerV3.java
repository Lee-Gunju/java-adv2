package chat.server;

import chat.server.command.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandManagerV3 implements CommandManager {

    private static final String DELEMITER = "\\|";
    private final SessionManager sessionManager;
    private final Map<String, Command> commands = new HashMap<>();

    public CommandManagerV3(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        commands.put("/join", new JoinCommand(sessionManager));
        commands.put("/message", new MessageCommand(sessionManager));
        commands.put("/change", new ChangeCommand(sessionManager));
        commands.put("/users", new UsersCommand(sessionManager));
        commands.put("/exit", new ExitCommand());

    }


    @Override
    public void execute(String totalMessage, Session session) throws IOException {
        String[] args = totalMessage.split(DELEMITER);
        String key = args[0];

        Command command = commands.get(key);
        if (command == null) {
            session.send("Invalid command" + totalMessage);
        }
        command.execute(args, session);




    }
}
