//package movies;
//
//import java.util.Arrays;
//
//public class MoviesApplication {
//        private static Input scanner = new Input();
//    static Movie[] movies;
//    static Input scanner;
//
//    public static void main(String[] args) {
//        scanner = new Input();
//        searchMovie();
//    }//end of main
//
//    private static void searchMovie() {
//        System.out.println("Welcome to Movie Application!");
//        System.out.println("Please select a number.");
//        System.out.println("0 - exit");
//        System.out.println("1 - view all movies");
//        System.out.println("2 - view movies in the animated category");
//        System.out.println("3 - view movies in the drama category");
//        System.out.println("4 - view movies in the horror category");
//        System.out.println("5 - view movies in the scifi category");
//        System.out.println("6 - add a movie");
//        System.out.println("Enter your choice:");
//        String selection = scanner.getString();
//
//        if (selection.startsWith("1") || selection.equalsIgnoreCase("all")) {
//            searchAll();
//            newSearch();
//        } else if (selection.startsWith("2") || selection.equalsIgnoreCase("animated")) {
//            searchAnimated();
//            newSearch();
//        } else if (selection.startsWith("3") || selection.equalsIgnoreCase("drama")) {
//            searchDrama();
//            newSearch();
//        } else if (selection.startsWith("4") || selection.equalsIgnoreCase("horror")) {
//            searchHorror();
//            newSearch();
//        } else if (selection.startsWith("5") || selection.equalsIgnoreCase("scifi")) {
//            searchScifi();
//            newSearch();
//
//        } else if (selection.startsWith("6") || selection.equalsIgnoreCase("add")) {
//            addMovie();
//            searchAll();
//
//        } else if (selection.startsWith("0") || selection.startsWith("e") || selection.startsWith("E")) {
//
//        } else {
//            return;
//        }
//    }
//
//    private static void searchAll() {
//        for (Movie movieGuys : MoviesArray.findAll()) {
//            System.out.println(movieGuys.getName() + "---" + movieGuys.getCategory());
//        }
//    }
//
//    private static void searchAnimated() {
//        for (Movie animated : MoviesArray.findAll()) {
//            if (animated.getCategory().equalsIgnoreCase("animated")) {
//                System.out.println(animated.getName());
//            }
//        }
//    }
//
//    private static void searchDrama() {
//        for (Movie drama : MoviesArray.findAll()) {
//            if (drama.getCategory().equalsIgnoreCase("drama")) {
//                System.out.println(drama.getName());
//            }
//        }
//    }
//
//    private static void searchHorror() {
//        for (Movie horror : MoviesArray.findAll()) {
//            if (horror.getCategory().equalsIgnoreCase("horror")) {
//                System.out.println(horror.getName());
//            }
//        }
//    }
//
//    private static void searchScifi() {
//        for (Movie scifi : MoviesArray.findAll()) {
//            if (scifi.getCategory().equalsIgnoreCase("scifi")) {
//                System.out.println(scifi.getName());
//            }
//        }
//    }
//
//    private static void newSearch() {
//        System.out.println();
//        System.out.println("New search?  Enter Yes or No below");
//        String newSearchResponse = scanner.getString();
//        if (newSearchResponse.toLowerCase().startsWith("yes")) {
//            searchMovie();
//        }
//    }
//
//    private static void addMovie() {
//        scanner = new Input();
//        System.out.println("What movie would you like to add?");
//        String addMovieScanner = scanner.getString();
//        System.out.println("What is the category?");
//        String addCatScanner = scanner.getString();
//        Movie[] updatedMovieList = Arrays.copyOf(movies, movies.length + 1);
//        updatedMovieList[updatedMovieList.length - 1] = new Movie(addMovieScanner, addCatScanner);
//        movies = updatedMovieList;
//    }
//}