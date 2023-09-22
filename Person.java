public class Person {
    private String name;
    private int birthYear;
    public Person() {
        this.name = "";
        this.birthYear = 0;
    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    @Override
    public boolean equals(Object obj) {
        Person next = (Person) obj;
        if(this.name == next.name && this.birthYear == next.birthYear) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
    }

    public int compareTo(Person p) {
        
        if(birthYear == p.getBirthYear()){
            return 0;
        }

        else if(birthYear >= p.getBirthYear()){
            return 1;
        }

        else{
            return -1;
        }
        
    }
}
