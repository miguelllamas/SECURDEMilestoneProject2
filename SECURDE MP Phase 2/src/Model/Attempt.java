package Model;

public class Attempt {
    private int id;
    private int trackedFailedAttempts;    

    public Attempt(int id, int trackedFailedAttempts){
        this.id = id;
        this.trackedFailedAttempts = trackedFailedAttempts;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrackedFailedAttempts() {
        return trackedFailedAttempts;
    }

    public void setTrackedFailedAttempts(int trackedFailedAttempts) {
        this.trackedFailedAttempts = trackedFailedAttempts;
    }
}
