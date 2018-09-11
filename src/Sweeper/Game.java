package Sweeper;

public class Game {
    private Bomb bomb;
    private Flag flag;
    private GameState state;

    public GameState getState() {
        return state;
    }

    public Game(int cols, int rows, int bombs) {
        Ranges.setSize(new Coord(cols, rows));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start() {
        bomb.start();
        flag.start();
        state = GameState.PLAYING;
    }

    public Box getBox(Coord coord) {
        if (flag.get(coord) == Box.OPENED)
            return bomb.get(coord);
        else
            return flag.get(coord);
    }

    public void pressLeftButton(Coord coord) {
        flag.setOpenedToBox(coord);
    }

    public void pressRightButton(Coord coord) {
        flag.toggleFlaggedToBox(coord);
    }
}
