/**
 * Created by ayako_sayama on 2016/12/06.
 */
public class Dog extends Animal implements onCreatureBirth{

    private String name="";

    public Dog(String name, boolean cute) {
        super.name = name;
        super.cute = cute;
    }

    @Override
    public void onBirth() {

    }

    public boolean isCute() {
        return false;
    }

    public boolean isSomething() {
        return false;
    }
}
