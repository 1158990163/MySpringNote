package SpringBook.myBean;


import org.springframework.stereotype.Component;

@Component
public class FireSong implements CD {

    private String songName = "fireSong";
    private String writer = "DL";

    @Override
    public void play() {
        System.out.println("The song is writed by" + writer + "  song name is " + songName);
    }
}
