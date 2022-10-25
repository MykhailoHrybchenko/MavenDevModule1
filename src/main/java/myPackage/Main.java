package myPackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Igor", "Petrenko");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonPerson = gson.toJson(person);
        System.out.println(jsonPerson);
    }
}
