public class Cat {

    private String color;

    public Cat(String color) {
        this.color = color;
    }

    Boolean equals(Cat catInput) {
        if (this.color.equals(catInput.color)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.color + " cat";
    }

    /* @Override
    public int hashCode() {
        return 7;
    } */

    public Cat clone() {
        Cat cat = new Cat(color);
        cat.color = this.color;
        return cat;
    }

}
