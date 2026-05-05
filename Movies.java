/*Question 12: Write a Java program to create a Movie class and count how many movies have rating greater than 4.

Description: Create Movie class with movieId, movieName and rating. Initialize using constructor. Store movie objects and count movies having rating above 4.
INPUT:
Enter 4 Movies:
1 Leo 4.5
2 Jawan 3.8
3 Pathan 4.2
4 Tiger 3.5

OUTPUT:
Movies with rating above 4: 2
*/
class Movie {
    int movieId;
    String movieName;
    double rating;

    // Constructor
    public Movie(int id, String name, double r) {
        movieId = id;
        movieName = name;
        rating = r;
    }
}

class Movies {
    public static void main(String[] args) {

        // Array of 4 movies
        Movie[] m = new Movie[4];

        // Initialize objects
        m[0] = new Movie(1, "Leo", 4.5);
        m[1] = new Movie(2, "Jawan", 3.8);
        m[2] = new Movie(3, "Pathan", 4.2);
        m[3] = new Movie(4, "Tiger", 3.5);

        int count = 0;

        // Count movies with rating > 4
        for (int i = 0; i < m.length; i++) {
            if (m[i].rating > 4) {
                count++;
            }
        }

        // Output
        System.out.println("Movies with rating above 4: " + count);
    }
}