package neu_psa;

import java.util.ArrayList;
import java.util.List;

public class Netflix {
    List<Genre> genres;

    public  Netflix(){
        genres = new ArrayList<>();
    }

    public void addGenre(Genre genre){
        genres.add(genre);
        genres.add(genre);
    }
}
