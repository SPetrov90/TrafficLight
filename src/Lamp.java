public class Lamp implements Light { // фонарь с лампочкой
    private Bulb bulb;
    private Colors color;

    public Lamp(Bulb bulb, Colors color) {
        this.bulb = bulb;
        this.color = color;
    }

    public void light() {
        if (bulb.isWork) {
            switch (color) {
                case REDLIGHT:
                    System.out.println("Горит красный");
                    break;
                case YELLOWLIGHT:
                    System.out.println("Горит желтый");
                    break;
                case GREENLIGHT:
                    System.out.println("Горит зеленый");
                    break;
            }
        } else {
            System.out.println("Лампочка не работает");
        }
    }

}
