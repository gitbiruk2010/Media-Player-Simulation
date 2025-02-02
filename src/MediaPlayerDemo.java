public class MediaPlayerDemo {
    public static void main(String[] args) {
        // Normal test cases
        System.out.println("----- Normal Test Cases -----");
        MediaPlayer audio = new AudioPlayer();
        audio.play("Reggae Mix");
        audio.pause();
        audio.stop();

        MediaPlayer video = new VideoPlayer();
        video.play("The Lion King (4K HDR)");
        video.pause();
        video.stop();

        MediaPlayer streaming = new StreamingPlayer();
        streaming.play("Max Live Event");
        streaming.pause();
        streaming.stop();

        // Edge test cases
        System.out.println("\n----- Edge Test Cases -----");
        // 1. Empty title
        audio.play("");
        // 2. Pause without starting playback
        video.pause();
        // 3. Stop a player that hasn't started
        streaming.stop();
    }
}