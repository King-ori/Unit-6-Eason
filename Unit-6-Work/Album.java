public class Album{
    private String title;
    private String artist;
    private double playTime;
    private int numTracks;

    public Album(String title, String artist, int tracks, double time){
        this.title = title;
        this.artist = artist;
        numTracks = tracks;
         playTime = time;
    }
    public String toString(){
        String result = "";
        result += title + " , by "+  artist + " | " + numTracks + "tracks, Time:" + playTime + "min";
        return result;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist(){
        return artist;
    }
}