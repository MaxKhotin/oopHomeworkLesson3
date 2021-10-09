package Task1;

public class ExcellentPupil extends Pupil {
    @Override
    void study(){
        System.out.println("Pupil studies very well");
    }
    @Override
    void read(){
        System.out.println("Pupil is very good at reading");
        System.out.println();
    }
    @Override
    void write(){
        System.out.println("Pupil writes without mistakes");
    }
    @Override
    void relax(){
        System.out.println("Pupil relaxes by reading books");
    }
}
