package Model;

public class Programmer {

    private int id;

    private String name;
    private String email;

    private String programmingLanguage;

    private String experience;

    private String workingTime;
    private static int cntID = 0;


    public Programmer(String name, String email, String programmingLanguage, String experience, String workingTime) {
        this.name = name;
        this.email = email;
        this.programmingLanguage = programmingLanguage;
        this.experience = experience;
        this.workingTime = workingTime;
        this.id = ++cntID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "id=" + id + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", experience='" + experience + '\'' +
                ", workingTime='" + workingTime + '\'' +
                '}';
    }
}
