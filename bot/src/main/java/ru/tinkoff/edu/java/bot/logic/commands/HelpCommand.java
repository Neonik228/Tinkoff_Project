package ru.tinkoff.edu.java.bot.logic.commands;

import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.Getter;
import ru.tinkoff.edu.java.bot.logic.commands.enums.InitBaseCommands;
import ru.tinkoff.edu.java.bot.logic.wrapper.SendSimpleMessage;

@Getter
public class HelpCommand implements BaseCommand{
    @Override
    public SendMessage execute(Message message) {
        StringBuilder text = new StringBuilder("Список всех команд:");
        for (InitBaseCommands command : InitBaseCommands.values())
        {
            text.append("\n");
            text.append(command);
        }
        return SendSimpleMessage.create(message, text.toString());
    }
}
