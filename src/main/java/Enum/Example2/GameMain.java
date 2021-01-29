package Enum.Example2;

public class GameMain {
    public static void main(String[] args) {
        Game game = new Game();
        game.setName("Doom eternal");
        game.setGameLevel(GameLevel.HARDCORE);

        game.setGameLevel(GameLevel.EASY);

        System.out.println("Current game - " +  game.getName());
        System.out.println("Current game level - " + game.getGameLevel());
        System.out.println("You will be given " + game.getGameLevel().getArmourType());
    }
}
