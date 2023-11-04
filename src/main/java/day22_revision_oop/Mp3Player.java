package day22_revision_oop;

public class Mp3Player implements MusicPlayer {

    @Override
    public void playing_music() {
        System.out.println("Mp3 playing Music");
    }

    @Override
    public void pausing() {
        System.out.println("Mp3 Phone pausing");
    }

    @Override
    public void stopping() {
        System.out.println("Mp3 Phone stopping");
    }

    @Override
    public void skipping_forward() {
        System.out.println("Mp3 Phone skipping forward");
    }

    @Override
    public void skipping_backward() {
        System.out.println("Mp3 Phone skipping backward");
    }
}
