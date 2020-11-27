public class Bicycle implements Transportation {

    @Override
    public void calculateTime(float distance) {
        float transportSpeed = 25;
        System.out.println("Voce vai chegar ao seu destino em: "
                + (distance / transportSpeed) * 60 + " minutos");
    }
}