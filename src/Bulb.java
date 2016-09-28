public class Bulb implements Light {
    // работает ли лампочка
    boolean isWork;

    public Bulb() {
        isWork = true;
    }

    public void light() {
        if (isWork)
            System.out.println("лампочка работает");
    }
}
