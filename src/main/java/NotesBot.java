import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class NotesBot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new NotesBot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }

    public void sendStartMessage(Message message, String text) {
        SendMessage msg = new SendMessage();
        msg.setChatId(message.getChatId());
        msg.setText(text);
        try {
            execute(msg);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String text = message.getText();
        if (text.equals("/start")) {
            sendStartMessage(message, "Привет!");
        }
    }

    @Override
    public String getBotUsername() {
        return "booknotes_bot";
    }

    @Override
    public String getBotToken() {
        return "589688376:AAHshUiaLWli8XAEFCN7Yb4cF9DMj9tl3-k";
    }
}
