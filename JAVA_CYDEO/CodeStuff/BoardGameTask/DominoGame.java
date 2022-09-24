package CodeStuff.BoardGameTask;

public class DominoGame extends BoardGame{

    private int weigthFigure;
    private int weigthBox;
    public double total;

    //set name екстендиться само по собі

    public DominoGame(String name, int weigthFigure, int weigthBox) {
        super(name);
        setWeigthFigure(weigthFigure);
        setWeigthBox(weigthBox);
    }
    public int getWeigthFigure() {
        return weigthFigure;
    }
    public void setWeigthFigure(int weigthFigure) {
        this.weigthFigure = weigthFigure * 28;
    }
    public int getWeigthBox() {
        return weigthBox;
    }
    public void setWeigthBox(int weigthBox) {
        this.weigthBox = weigthBox;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(int box, int figure) {
        this.total = box+(figure*28);
    }
}
