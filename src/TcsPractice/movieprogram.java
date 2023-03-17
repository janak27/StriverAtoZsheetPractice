package TcsPractice;

import java.util.*;
class movieprogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] mo = new Movie[4];
        for (int i = 0; i < mo.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.nextLine();
            mo[i] = new Movie(a,b,c,d);
        }

        String in1 = sc.nextLine();
        int in2 = sc.nextInt();
        int in3 = sc.nextInt();
        sc.nextLine();
        int result1 = findAvgBudgetByDirector(mo,in1);
        System.out.println(result1);

        Movie result2 = getMovieByRatingBudget(mo,in2,in3);
        if(result2 == null){
            System.out.println("Na");
        }
        System.out.println(result2.movieId);
    }

    public static Movie getMovieByRatingBudget(Movie[] mo,int in2,int in3){
        for (int i = 0; i < mo.length; i++) {
            if ((mo[i].rating == in2) && (mo[i].budget == in3) && (mo[i].budget % mo[i].rating == 0)){
                return mo[i];
            }
        }
        return null;
    }
    public static int findAvgBudgetByDirector(Movie[] mo, String in1){
        int sum = 0;
        int avg = 0;
        int n = 0;
        for (int i = 0; i < mo.length; i++) {
            if (mo[i].director.equalsIgnoreCase(in1)){
                n = n + 1;
                sum = sum + mo[i].budget;
            }
        }
        avg = sum / n;
        if(n > 0){
            return avg;
        }
        return 0;
    }
}

class Movie{
    int movieId;
    String director;
    int rating ;
    int budget;

    public Movie(int movieId, String director, int rating, int budget) {
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

//    public int getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getDirector() {
//        return director;
//    }
//
//    public void setDirector(String director) {
//        this.director = director;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public int getBudget() {
//        return budget;
//    }
//
//    public void setBudget(int budget) {
//        this.budget = budget;
//    }
}