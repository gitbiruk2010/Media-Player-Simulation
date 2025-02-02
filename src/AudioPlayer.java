public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("[Audio Player] Playing: " + title);
    }

    @Override
    public void pause() {
        System.out.println("[Audio Player] Paused.");
    }

    @Override
    public void stop() {
        System.out.println("[Audio Player] Stopped.");
    }
}