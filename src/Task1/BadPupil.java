package Task1;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Pupil is bad at studying");
    }

    @Override
    void read() {
        System.out.println("Pupil doesn't know how to read");
        System.out.println();
    }

    @Override
    void write() {
        System.out.println("Pupil can't write without a ton of mistakes");
    }

    @Override
    void relax() {
        System.out.println("Pupil relaxes all day long");
    }
}
