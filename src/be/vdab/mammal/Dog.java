package be.vdab.mammal;

public class Dog {
    public Dog() {
    }


    private String bark() {
        return "Waf waf";
    }

    private String beg() {
        return "Awuuuuuu";
    }

    private String chase() {
        return "whiiiiiiii";

    }

    public void react(String command) {
        if (command.equals("SPEAK")) {
            System.out.println(bark());
        }
        if (command.equals("BEG")) {
            System.out.println(beg());
        }
        if (command.equals("LOOK,THE POSTMAN")) {
            System.out.println(chase());
        }
    }
}
