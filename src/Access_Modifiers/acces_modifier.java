package Access_Modifiers;

class myemployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class acces_modifier {
    public static void main(String[] args) {
        myemployee prasad = new myemployee();
        prasad.setName("CodewithPrasad");
        prasad.setId(10);
        System.out.println(prasad.getName());
        System.out.println(prasad.getId());
    }
}
