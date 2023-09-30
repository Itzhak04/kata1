package paquete.ejemplo;

import java.time.LocalDate;

public class person {
    final String name;
    final LocalDate birthday;

    public person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public  int toAge(){
        return  toYear(LocalDate.now().toEpochDay()-birthday.toEpochDay());
    }

    private int toYear(long days ) {
        return (int) (days/365);
    }

}
