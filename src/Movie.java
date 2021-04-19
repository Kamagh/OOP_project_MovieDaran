/***
 * added -instance variables Actor actor, year,duration,country, added their accessors and mutators
 * initialized in constructors, changed Movie.Movie.Genre - Movie.Genre
 * */

public class Movie {

    public enum Genre {
        ACTION,ADVENTURE,THRILLER,MARTIAL_ARTS, HORROR,MELODRAMA,COMEDY,DRAMA,HISTORICAL,ROMANCE,DOCUMENTARY,SCIENCE_FICTION, CRIME_FILM;
        public static Genre fromString(String s){
            if (s.equals("comedy")) {
                return COMEDY;
            } else if (s.equals("horror")){
                return HORROR;
            }else if (s.equals("drama")) {
                return DRAMA;
            }else if (s.equals("action")){
                return ACTION;
            }else if (s.equals("adventure")){
                return ADVENTURE;
            }else if (s.equals("thriller")){
                return THRILLER;
            }else if (s.equals("martial_arts")){
                return MARTIAL_ARTS;
            }else if (s.equals("melodrama")){
                return MELODRAMA;
            }else if (s.equals("historical")){
                return HISTORICAL;
            }else if (s.equals("romance")){
                return ROMANCE;
            }else if (s.equals("crime film")) {
                return CRIME_FILM;
            }
            else if (s.equals("science_fiction")){
                return SCIENCE_FICTION;
            } else if (s.equals("documentary")){
                return DOCUMENTARY;
            } else {
                return null;
            }
        }

    }

    private String title;
    private int year;
    private Director director;
    private Genre genre;
    private String duration;
    private String country;
    private Actor actor;
    //private Actor[] cast;
    private String about;



    /**
     *
     *
     * @param title first instance variable the title of the Movie
     * @param year second instance variable the year of the Movie
     * @param director third instance variable the director of the Movie
     * @param genre forth instance variable the genre of the Movie
     */
    public Movie(String title, int year, Director director, Genre genre, /*String duration*/ String country, /*Actor actor*/ String about) {
        this.title = title;
        this.year = year;
        this.director = new Director(director);
        this.genre = genre;
        this.duration = duration;
        this.country = country;
        this.actor = new Actor(actor);
        this.about = about;

    }

    /**
     *
     * @param otherMovie is the copy of Movie class by copy constructor copy its content
     */
    public Movie(Movie otherMovie){
        if (otherMovie != null) {
            this.title = otherMovie.title;
            this.year = otherMovie.year;
            this.director = new Director(otherMovie.director);
            this.genre = otherMovie.genre;
            this.duration = otherMovie.duration;
            this.country = otherMovie.country;
            this.actor = new Actor(otherMovie.actor);
            this.about = otherMovie.about;

        }else {
            System.out.println("Fatal error");
            System.exit(0);
        }
    }
    /**
     *
     * @return get and set (by the user) the title, year director and genre of the movie
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        if (year < 0)
            return 0;
        else
            return year;
    }


    public void setYear(int year) {
        if (year < 0)
            this.year = year;
        else
            this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(String firstname, String lastname) {
        this.director.setFirstname(director.getFirstname());
        this.director.setLastname(director.getLastname());
    }


    /**
     *
     * @return Genre, return the genre of the movie
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     *
     * @param genre set genre by the user
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDuration() {

        return duration;
    }

    public void setDuration(String duration) {

        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //getter setter for actor
/*    public Actor getActor() {
        return actor;
    }*/

/*    public void setActor(Actor actor) {
        this.actor.setFirstname(Movie.this.actor.getFirstname());
        this.actor.setLastname(Movie.this.actor.getLastname());
    }*/

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    // TODO
    // method which will generate cast based on inputed actors
/*    public Actor[] cast(Actor actor){

        return
    }*/


    /**
     *
     * @return String return String with this form (‘‘A Beautiful Mind’’, a drama from 2004 by Ron Howard)
     */
    @Override
    public String toString() {
        return "<<image>>"+"\"" + "\n" + title + "\"," + "\n"+ " a " +
                genre.toString().toLowerCase() +" from " + year + "\n" +
                " by " + director.getFirstname() +
                director.toString() + "\n" + " duration: "+duration
                + "country: "+country+"\n" + "Cast: " +"\n"+about;  //TODO+ Movie.cast(actors)

    }





}