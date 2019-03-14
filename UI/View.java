package UI;

import Controller.*;
import Domain.Bird;
import Domain.Cow;
import Domain.MyException;
import Domain.Pig;
import Repository.*;

public class View {
    public static void main(String [] args){
        Pig p1 = new Pig(2,"porc",33);
        Cow c1 = new Cow(1,"vaca",4);
        Bird b1 = new Bird(5,"chicken",1);
        Repo r = new Repo(3);

        try {
            r.add(p1);
            r.add(c1);
            r.add(b1);
            r.add(c1);
            System.out.println("No exception found");
        }
        catch(MyException e){
            System.out.println(e);
        }
        try {
            r.remove(2);
            r.remove(5);

            System.out.println("found");
        }
        catch(MyException e){
            System.out.println(e);
        }
        Controller c = new Controller(r);
        System.out.println("The animals in the repo are:");
        c.addElement(b1);
        System.out.println(c.filter(0));
        System.out.println("The animals with the weight higher than 3 are:");
        System.out.println(c.filter(3));

        //Controller c = new Controller(r);
    }
}
