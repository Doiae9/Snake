import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int boardWidth, boardHeight;
        boardWidth = 600;
        boardHeight = boardWidth;

    //Inicialización del bloque
        JFrame frame = new JFrame("snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}