public class TrisGame {
    // 07 inizializzo le variabili e il costruttore
    private int n;
    private char [][] board;
    private char currentPlayer;


    public TrisGame(int n) {
        this.n = n;
        board = new char[n][n];
        this.currentPlayer = 'X';
        // 09 richiamo la funzione per inizializzare la board
        initializeBoard();
    }


    // 08 Inizializza la board con celle vuote
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    // 10 creo il metodo getCurrentPlayer
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    // 11 Effettua la mossa del giocatore corrente sulla cella (row, col)
    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayer;
            return true; // Mossa valida
        }
        return false; // Mossa non valida
    }
    // 12 Verifica se il giocatore corrente ha vinto
    public boolean checkWin() {
        // Verifica righe e colonne
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true; // Vittoria sulla riga i
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true; // Vittoria sulla colonna i
        }
        // Verifica diagonali
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer))
            return true; // Vittoria sulla diagonale
        return false; // Nessuna vittoria
    }
    // 13 Verifica se la board è piena (pareggio)
    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; // La board non è piena
                }
            }
        }
        return true; // La board è piena (pareggio)
    }
    // 14 Cambia il giocatore corrente
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
