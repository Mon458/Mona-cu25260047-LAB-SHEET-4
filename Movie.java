class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        Movie m = new Movie();

        String movieName = "Dangal";
        String movieGenre = "Sports";
        double movieRating = 8.3;

        m.name = movieName;
        m.genre = movieGenre;
        m.rating = movieRating;

        m.display();
    }
}
