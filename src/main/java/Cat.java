public class Cat {
    private String message = "Мяу!";
    private byte age = 2;
    private String gender;

    public Cat(byte age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public String getMessage() { return message;};

    public void setMessage(String message) {
        this.message = message;
    }
}
