package day22_revision_oop;

public class MobilePhone implements MusicPlayer{

    @Override
    public void playing_music() {
        System.out.println("Mobile Phone playing Music");
    }

    @Override
    public void pausing() {
        System.out.println("Mobile Phone pausing");
    }

    @Override
    public void stopping() {
        System.out.println("Mobile Phone stopping");
    }

    @Override
    public void skipping_forward() {
        System.out.println("Mobile Phone skipping forward");
    }

    @Override
    public void skipping_backward() {
        System.out.println("Mobile Phone skipping backward");
    }
}
