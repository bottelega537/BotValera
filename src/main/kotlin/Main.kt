import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession

fun main() {
    val botsApi = BotValera()
    TelegramBotsApi(DefaultBotSession::class.java).registerBot(botsApi)
}