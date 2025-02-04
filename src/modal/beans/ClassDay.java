package modal.beans;

/**
 *
 * @author LenovoTLC
 */
public class ClassDay {

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    public ClassDay() {
    }

    public ClassDay(String id,String day, String time) {
        this.id=id;
        this.day = day;
        this.time = time;
    }
    
    private String id;
    private String day;
    private String time;
}
