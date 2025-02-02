public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("[Video Player] Streaming: " + title);
    }

    @Override
    public void pause() {
        System.out.println("[Video Player] Buffering...");
    }

    @Override
    public void stop() {
        System.out.println("[Video Player] Session ended.");
    }
}