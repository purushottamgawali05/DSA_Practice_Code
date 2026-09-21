
public class SetterAndGetter {

    public static void main(String args[]) {
        Pen p1 = new Pen();

        p1.setColor("Orange");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setTip(100);
        System.out.println(p1.getTip());

    }

}

class Pen {

    private String color;
    private int tip;

    String getColor() {
        return color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
