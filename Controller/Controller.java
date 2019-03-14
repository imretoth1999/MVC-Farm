package Controller;

import Domain.IEnt;
import Domain.MyException;
import Repository.*;

public class Controller {
    IRepo repo;
    public Controller (IRepo r)
    {
        repo = r;
    }
    public String filter(int w)
    {
        String res="";
        IEnt[] vec = repo.getAll();
        for(int i = 0;i<repo.getPos();i++)
        {
            if(vec[i].getWeight() > w) {
                res += vec[i].toString();
                res+="\n";
            }
        }
        return res;
    }
    public String addElement(IEnt e)
    {
        try {

            repo.add(e);
           return "The element was added";
        }
        catch(MyException ex) {
                return "Exception happened";
        }
    }
    public String removeElement(int i){
        try{
            repo.remove(i);
            return "The element was deleted";
        }
        catch(MyException ex)
        {
            return "Exception happened";

        }
    }
}
