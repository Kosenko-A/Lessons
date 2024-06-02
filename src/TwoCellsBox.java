import java.util.List;

public class TwoCellsBox<T, S> {
    private T firstCellItem;
    private S secondCellItem;

    public void putItem(T item, S item2) {
        this.firstCellItem = item;
        this.secondCellItem = item2;
    }

    public T getItemT() {
        return firstCellItem;
    }

    public S getItemS() {
        return secondCellItem;
    }
}
