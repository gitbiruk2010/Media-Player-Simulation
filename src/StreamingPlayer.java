public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        System.out.println("[Streaming Player] Now streaming: " + title);
    }

    @Override
    public void pause() {
        System.out.println("[Streaming Player] Connection paused.");
    }

    @Override
    public void stop() {
        System.out.println("[Streaming Player] Disconnected.");
    }
}