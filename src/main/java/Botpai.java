import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Botpai extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();

        if (message.getText().equals("Hi")){
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("Hi from Botpai!");

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "@botpai_bot";
    }

    @Override
    public String getBotToken() {
        return "930970224:AAHF_n2Az9aR9EcAwSUd7gv5ggw7Cf55CFc";
    }
}
