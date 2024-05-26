public class Cat implements Cloneable{

    private String color;
    private Voice voice;

    public Cat(String color, Voice voice) {
        this.color = color;
        this.voice = voice;
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
        return voice.mau();
    }

    @Override
    public int hashCode() {
        return 7;
    }

    /*public Cat clone() {
        Cat cat = new Cat(color);
        cat.color = this.color;
        return cat;
    }*/

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
