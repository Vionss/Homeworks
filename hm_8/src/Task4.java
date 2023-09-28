import java.util.Random;

public class Task4 {
    /*
    Создайте массив, содержащий в себе название карточных мастей.
    Создайте массив, содержащий в себе карты от двойки до туза.
    Раздайте из колоды по 6 карт на 4 игрока
     */
    public static void main(String[] args) {

        // Створюємо масив мастей
        String[] suits = {"Черви", "Бубни", "Крести", "Пики"};

        // Створюємо масив з рангами карт
        String[] ranks = {"Двійка", "Трійка", "Четвірка", "П'ятірка", "Шістка", "Сімка", "Вісімка", "Дев'ятка", "Десятка", "Валет", "Дама", "Король", "Туз"};

        // Створюємо колоду з усіма можливими картами
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " " + suit;
                index++;
            }
        }

        // Перемішуємо колоду
        shuffleDeck(deck);

        // Роздаємо по 6 карт на 4 гравців
        int playersCount = 4;
        int cardsPerPlayer = 6;

        for (int player = 1; player <= playersCount; player++) {
            System.out.println("Гравець " + player + ":");
            for (int i = 0; i < cardsPerPlayer; i++) {
                int cardIndex = (player - 1) * cardsPerPlayer + i;
                System.out.println(deck[cardIndex]);
            }
            System.out.println();
        }
    }

    // Метод для перемішування колоди
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
}
