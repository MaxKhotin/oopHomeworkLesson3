package Task1;

public class ClassRoom {
    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupil1.study();
        pupil1.relax();
        pupil1.write();
        pupil1.read();
        pupil2.study();
        pupil2.relax();
        pupil2.write();
        pupil2.read();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        pupil3.study();
        pupil3.relax();
        pupil3.write();
        pupil3.read();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this(pupil1, pupil2, pupil3);
        pupil4.study();
        pupil4.relax();
        pupil4.write();
        pupil4.read();
    }

}
