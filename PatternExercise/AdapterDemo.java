package PatternExercise;
interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AdvancedMediaPlayer {
    void playMp4(String fileName) { System.out.println("Playing MP4: " + fileName); }
}

class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMp4(fileName);
        } else {
            System.out.println("Format not supported");
        }
    }
}

class AudioPlayer implements MediaPlayer {
    MediaAdapter adapter = new MediaAdapter();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3: " + fileName);
        } else {
            adapter.play(audioType, fileName);
        }
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "song1.mp3");
        player.play("mp4", "movie.mp4");
    }
}
