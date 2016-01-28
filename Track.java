/**
 * Store the details of a music track,
 * such as the artist, title, and file name.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class Track
{
    // The artist.
    private String artist;
    // The track's title.
    private String title;
    // Where the track is stored.
    private String filename;
    // Las veces que se ha reproducido el track.
    private int count;
    // Guarda el disco o album de la canci�n.
    private String album;
    
    /**
     * Constructor for objects of class Track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    public Track(String artist, String title, String filename)
    {
        setDetails(artist, title, filename);
        this.count = 0;
        this.album = "Desconocido";
    }
    
    /**
     * Constructor for objects of class Track.
     * It is assumed that the file name cannot be
     * decoded to extract artist and title details.
     * @param filename The track file. 
     */
    public Track(String filename)
    {
        setDetails("unknown", "unknown", filename);
    }
    
    /**
     * Return the artist.
     * @return The artist.
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Return the title.
     * @return The title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Return the file name.
     * @return The file name.
     */
    public String getFilename()
    {
        return filename;
    }
        
    /**
     * Return details of the track: artist, title and file name.
     * @return The track's details.
     */
    public String getDetails()
    {
        return artist + ": " + title + "  (file: " + filename + ") Album: " + album + " N� de reproducciones: " +count;
    }
    
    /**
     * Set details of the track.
     * @param artist The track's artist.
     * @param title The track's title.
     * @param filename The track file. 
     */
    private void setDetails(String artist, String title, String filename)
    {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }
    
    /**
     * Metodo que incrementa el numero de veces que ya se ha reproducido este Track de uno en uno.
     */
    public void incrementoReprod(){
        count++;
    }
    
    /**
     * Metodo que resetea el numero de veces que ya se ha reproducido este Track.
     */
    public void resetReprod(){
        count = 0;
    }
    
    /**
     * Metodo para cambiar el Album de la canci�n.
     */
    public void setAlbum(String newAlbum){
        album = newAlbum;
    }
    
    /**
     * Metodo para cambiar el Album de la canci�n.
     */
    public String getAlbum(){
        return album;
    }
}
