package Task1;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Pupil is good at studying");
    }

    @Override
    void read() {
        System.out.println("Pupil reads well");
        System.out.println();
    }

    @Override
    void write() {
        System.out.println("Pupil writes with a few mistakes");
    }

    @Override
    void relax() {
        System.out.println("Pupil relaxes by playing games");
    }
}
