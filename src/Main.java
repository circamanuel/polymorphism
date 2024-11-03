import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Movie theMovie = Movie.getMovie("Science", "Star Wars");
        theMovie.watchMovie();
*/

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Type (A for Adventure c for Comedy, " +
                    "S for Science Fiction, pr Q to quit):");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
