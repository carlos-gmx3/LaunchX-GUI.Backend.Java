public class HolaMundo {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenidos a la misión Backend de Java", "Victor Mono", 28, Colors.Desire);
        screen.setVisible(true);

        str = d.readString("¿Quieres aprender a hacer esto?");
        if(str.charAt(0) == 's' || str.charAt(0) == 'S') {
            screen.showImage("Zen-nakji.jpg");
            screen.out("Hola explorers");
        } else {
            screen.out("Tal vez en otro momento, Adios!", "Century Schoolbook L", 28, Colors.BalticSea);
        }
    }
}
