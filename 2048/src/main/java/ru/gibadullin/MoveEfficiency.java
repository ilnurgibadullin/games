package ru.gibadullin;

public class MoveEfficiency implements Comparable<MoveEfficiency> {
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public Move getMove() {
        return move;
    }

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public int compareTo(MoveEfficiency o) {
        if (this.numberOfEmptyTiles > o.numberOfEmptyTiles) {
            return 1;
        } else if (this.numberOfEmptyTiles < o.numberOfEmptyTiles) {
            return -1;
        } else if (this.score > o.score) {
            return 1;
        } else if (this.score < o. score) {
            return -1;
        } else {
            return 0;
        }
    }
}