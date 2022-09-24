package CodeStuff.BoardGameTask;

public class ChessGame extends BoardGame{

    private int weigthFigure;
    private int weigthDoshka;
    public double total;

    //set name екстендиться само по собі


    public ChessGame(String name, int weigthFigure, int weigthDoshka) {
        super(name);
        setWeigthDoshka(weigthDoshka);
        setWeigthFigure(weigthFigure);
    }

    public int getWeigthFigure() {
        return weigthFigure;
    }

    public void setWeigthFigure(int weigthFigure) {
        this.weigthFigure = weigthFigure *24;
    }

    public int getWeigthDoshka() {
        return weigthDoshka;
    }

    public void setWeigthDoshka(int weigthDoshka) {
        this.weigthDoshka = weigthDoshka;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int doska, int figure) {
        this.total = doska+(figure*24);
    }
}
