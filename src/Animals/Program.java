package Animals;

public class Program {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.weight = 100;
        //animal.makeNoise();

        Bird seagull = new Bird();
        seagull.weight = 10;
        seagull.canFly = true;
        //seagull.makeNoise();

        Dog reksio = new Dog();
        Parrot polly = new Parrot();

        Animal [] zoo = {animal, seagull, reksio, polly, polly};

        for(Animal a : zoo) {
            a.makeNoise();
        }
    }
}
