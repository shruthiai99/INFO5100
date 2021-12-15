package neu_psa;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Q1
        int[][] room = {
                {0,0,1,-1},
                {1,1,-1,1},
                {-1,-1,0,0}
        };
        Roomba roomba = new Roomba(room);

        //Q2
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);

        //Q3
        int[] nums = {1,1,1};
        System.out.println(count(nums, 1));

        //Q4
        //Add List of movies based on the classes created above.
        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Movies movie1 = new Movies("Titanic", date1, "Mark Anthony");
        movie1.addActors("Kate");
        movie1.addActors("Linda");
        movie1.addActors("Zoey");

        Date date2 = new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime();
        Movies movie2 = new Movies("Anabella", date2, "Jon Wan");
        movie1.addActors("Walden");
        movie1.addActors("Alan");
        movie1.addActors("Jake");

        Date date3 = new GregorianCalendar(1997, Calendar.JANUARY, 11).getTime();
        Movies movie3 = new Movies("FastAndFurious", date3, "Vin Diesel");
        movie1.addActors("Michael");
        movie1.addActors("Pam");
        movie1.addActors("Jim");

        Date date4 = new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime();
        Movies movie4 = new Movies("Shutter Island", date4, "Monica");
        movie1.addActors("Rachael");
        movie1.addActors("Jordan");
        movie1.addActors("Leo");

        Date date5 = new GregorianCalendar(2020, Calendar.FEBRUARY, 30).getTime();
        Movies movie5 = new Movies("LionKing", date5, "Monica");
        movie1.addActors("Pheobe");
        movie1.addActors("Dwight");
        movie1.addActors("Arsenal");

        Genre genre1 = new Genre();
        Genre genre2 = new Genre();

        genre1.addMovies(movie1);
        genre1.addMovies(movie2);

        genre2.addMovies(movie3);
        genre2.addMovies(movie4);
        genre2.addMovies(movie5);

        Netflix netflix = new Netflix();
        netflix.addGenre(genre1);
        netflix.addGenre(genre2);

        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using
        //flatMap.
        Date dateCheck = new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime();
        List<String> movies =
                netflix.genres.stream().
                flatMap((genre)-> genre.moviesList().stream()).
                filter(m -> m.getReleaseDate().before(dateCheck))
                        .map(n -> "classic"+ n.getTitle()).
                collect(Collectors.toList());

        //To get the latest 3 movies

        List<String> latest = netflix.genres.stream().
                flatMap((genre) -> genre.moviesList().stream()).
                sorted((m1, m2) -> m2.getReleaseDate().compareTo(m2.getReleaseDate())).
                limit(3).map(m -> m.getTitle()).collect(Collectors.toList());

        //Create a predicate for release date before 2000 and a predicate for release date before 1990
        //and then Chain the predicates for finding movies between 1990 and 2000.
        Date predicateDate1 = new GregorianCalendar(1990, Calendar.JANUARY, 01).getTime();
        Date predicateDate2 = new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime();
        Predicate<Date> before1990 = (date -> date.before(predicateDate1));
        Predicate<Date> before2000 = (date -> date.before(predicateDate2));

        //List of movies from all genres
        List<Movies> movieList = netflix.genres.stream().
                flatMap(genre -> genre.moviesList().stream()).collect(Collectors.toList());

        for(Movies movie : movieList){
            if(before1990.and(before2000).test(movie.getReleaseDate())){
                System.out.println(movie.getTitle());
            }
        }

        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        Collections.sort(movieList, (m1,m2) -> m1.getTitle().compareTo(m2.getTitle()));

        //Write a method which that will add release year in the title of the movie and return the title and
        //then use this method for all the movies.
        BiFunction<Date, String, String> merge = (date, str) ->{
            String merged = date.toString() + str;
            return merged;
        };

        for(Movies movie : movieList){
            merge.apply(movie.getReleaseDate(), movie.getTitle());
        }
    }

    //Q2
    public static List<List<String >> groupAnagrams(String[] words){
        List<List<String>> result = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String str : words){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String word = String.valueOf(chars);
            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(str);

        }
        for(ArrayList<String> list : map.values()){
            result.add(list);
        }
        return result;
    }

    //Q3
    public static int count(int[] nums, int target){
        int count  = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + nums[k];
                }
                if(sum == target){
                    count++;
                }
            }
        }
        return count;
    }
}
