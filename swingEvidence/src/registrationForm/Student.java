
package registrationForm;


public class Student {
    private int serial;
    private String name;
    private String email;
    private String gender;
    private String hobby;
    private String round;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Student(int serial, String name, String email, String gender, String hobby, String round) {
        this.serial = serial;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
    }

    public Student() {
    }
    
}
