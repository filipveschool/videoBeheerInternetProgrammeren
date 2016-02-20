package domain;

import java.util.ArrayList;
import java.util.List;

import db.OpslagVerbindingInterface;
import db.VideoBeheerDbFake;
import domain.Movie;
import domain.Actor;

/**
 * Created by filip on 18/02/2016.
 *
 * Dit is mijn facade klasse.
 *
 * Hier moeten alle methodes gebruikt worden om te linken met andere klassen.
 *
 *
 */
public class VideoBeheer {

    //private List<Movie> movies;
    //private List<Actor> actors;



    private OpslagVerbindingInterface videoBeheerDbFake;

    public VideoBeheer() {

        videoBeheerDbFake = new VideoBeheerDbFake();
        //this.movies = new ArrayList<Movie>();
        //this.actors = new ArrayList<Actor>();
    }

    /**
     * Hier komt alles van de klasse Movie
     *
     */

    public List<Movie> getAllMovies(){
        return getVideoBeheerDbFake().getAllMovies();
    }

    /**
     * Hier wordt een lijst opgehaald uit de DB klasse.
     * @return een lijst van alle actors die meespelen in 1 film
     */
    public List<Actor> getAllActorsFromOneMovie(Movie movie){
        return getVideoBeheerDbFake().getAllActorsFromOneMovie(movie);
    }

    public List<Actor> getAllActors(){
        return getVideoBeheerDbFake().getAllActors();
    }


/* Later Implementeren, is optioneel

    public List<Movie> generateListOfMoviesAlreadySeen() {

        List<Movie> moviesSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen()) {
                moviesSeen.add(movies.get(i));
            }

        }

        return moviesSeen;
    }
*/
    /* Later Implementeren, is optioneel

    public List<Movie> generateListOfMoviesNotSeen() {
        List<Movie> moviesNotSeen = new ArrayList<Movie>();

        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).isSeen() == false) {
                moviesNotSeen.add(movies.get(i));
            }
        }

        return moviesNotSeen;
    }
*/

    /* Later Implementeren, is optioneel

    public List<Movie> getActorfromMovies(Actor actor) {
        return actor.getMoviesPlayedIn();
    }
*/

    /**
     * CRUD ==> create
     */
    public void addMovie(Movie movie){
getVideoBeheerDbFake().addMovie(movie);
    }

    /**
     * CRUD ==> read
     */
    public Movie getMovie(String naam, int jaar){
return getVideoBeheerDbFake().getMovie(naam,jaar);
    }

    /**
     * CRUD ==> update
     */
    public void updateMovie(Movie movie, Movie oldMovie){
getVideoBeheerDbFake().updateMovie(movie,oldMovie);
    }

    /**
     * CRUD ==> delete
     */
    public void deleteMovie(Movie movie){
getVideoBeheerDbFake().deleteMovie(movie);
    }

    /**
     * CRUD ==> create
     */
    public void addActor(Actor actor){
getVideoBeheerDbFake().addActor(actor);
    }

    /**
     * CRUD ==> create 2
     */
    public void addActor(Actor actor, Movie movie){
        getVideoBeheerDbFake().addActor(actor, movie);
    }

    /**
     * CRUD ==> read
     */
    public Actor getActor(String familieNaam, String voornaam){
return getVideoBeheerDbFake().getActor(familieNaam, voornaam);
    }

    /**
     * CRUD ==> update
     */
    public void updateActor(Actor actor, Actor oldActor){
    getVideoBeheerDbFake().updateActor(actor, oldActor);
    }

    /**
     * CRUD ==> delete
     */
    public void deleteActor(Actor actor){
        getVideoBeheerDbFake().deleteActor(actor);

    }


    public OpslagVerbindingInterface getVideoBeheerDbFake() {
        return videoBeheerDbFake;
    }

    public void setVideoBeheerDbFake(OpslagVerbindingInterface videoBeheerDbFake) {
        this.videoBeheerDbFake = videoBeheerDbFake;
    }
}