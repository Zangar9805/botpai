import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        Botpai botpai = new Botpai();

        try {
            System.out.println("//running bot ;)");
            botsApi.registerBot(botpai);
            System.out.println("//bot successfuly started...");
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
