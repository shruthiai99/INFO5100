package neu_psa;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    private List<Movies> movies;

    public Genre(){
        movies = new ArrayList<>();
    }

    public void addMovies(Movies movie){
        movies.add(movie);
    }

    public List<Movies> moviesList(){
        return movies;
    }
}
