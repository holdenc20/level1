package level1;

public class Netflix {
public static void main(String[] args) {
	//1. Instantiate some Movie objects (at least 5).
	Movie x=new Movie("movie",2);
	Movie y=new Movie("movie2",1);
	Movie z=new Movie("movie3",4);
	Movie w=new Movie("movie4",200);
	Movie q=new Movie("movie5",3);
	//2. Use the Movie class to get the ticket price of one of your movies.
	String cool= w.getTicketPrice();
	System.out.println(cool);
	//3. Instantiate a NetflixQueue.
	MovieQueue p=new MovieQueue();
	//4. Add your movies to the Netflix queue.
	p.addMovie(x);
	p.addMovie(y);
	p.addMovie(z);
	p.addMovie(w);
	p.addMovie(q);
	p.sortMoviesByRating();
	//5. Print all the movies in your queue.
	p.printMovies();
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	Movie o= p.getBestMovie();
	System.out.println("the best movie is "+ o  );
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
	Movie i=p.getSecondBestMovie();
	System.out.println("the second best movie is "+ i);

}}
