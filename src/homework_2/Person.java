package homework_2;

import java.util.Date;

public class Person {

    private String surname;
    private String name;
    private String patronymic;
    private Date date;
    private int phoneNumber;
    private char gender;

    public Person(String surname, String name, String patronymic, Date date, int phoneNumber, char gender) {

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date=" + date +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
