package DesignPatterns.Adapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    public void play(String audioType,String fileName) {
        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing mp3 file "+ fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else
        {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
