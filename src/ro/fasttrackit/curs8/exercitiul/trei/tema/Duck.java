package ro.fasttrackit.curs8.exercitiul.trei.tema;

public class Duck implements Animal {

    Duck(){

    }
    @Override
    public String walk() {
        return "Quack-walk!";
    }

    @Override
    public String talk() {
        return "Quaaaaakk!";
    }

    @Override
    public String eat() {
        return "Yammm";
    }
}
