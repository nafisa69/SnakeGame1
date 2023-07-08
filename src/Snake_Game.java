import javax.swing.*;

public class Snake_Game extends JFrame {

    Board board;
    Snake_Game(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);

    }
    public static void main(String[] args) {
        // initialize Game object
        Snake_Game sg= new Snake_Game();

    }
}
