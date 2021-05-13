package Question10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie 
{
	public static void main(String[] args) {

		List<Movie_Details> movie = Arrays.asList(new Movie_Details("Mast", "chichore", "jack", "Action"),
				new Movie_Details("frozen", "alien", "kitty", "thriller"));
				
		Collections.sort(movie, new Comparator<Movie_Details>() {

			@Override
			public int compare(Movie_Details o1, Movie_Details o2) {
				return o1.movie_Name.compareTo(o2.movie_Name);

			}

		});

		printallmovie(movie);
		remove_movie(movie, "Mersal");

	}

	private static void printallmovie(List<Movie_Details> movie) {
		for (Movie_Details p : movie)
			System.out.println(p);
	}

	public static void remove_movie(List<Movie_Details> movie, String name) {
		movie.remove(name);
	}

}