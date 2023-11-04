package day22_revision_oop;

public class MusicPlayerRunner{

    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.playing_music();
        mp3Player.pausing();
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.playing_music();
        mobilePhone.skipping_forward();
        mobilePhone.stopping();
    }
}
