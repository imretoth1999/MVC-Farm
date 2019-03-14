package Repository;

import Domain.IEnt;
import Domain.MyException;

public class Repo implements IRepo{
    IEnt[] r;
    int pos;
    public Repo(int a)
    {
        this.r = new IEnt[a];
        pos = 0;
    }
    public void add(IEnt e)throws MyException
    {
        if (r.length <= pos)
            throw new MyException("The array is full");
        else
        {
            r[pos] = e;
            pos++;
        }
    }

    public int getPos() {
        return pos;
    }

    public void remove(int p)throws MyException
    {
        if (pos < p)
            throw new MyException("The index is invalid");
        else
        {
            for(int j=p; j<(pos-1); j++)
            {
                        r[j] = r[j+1];
            }
            pos--;
        }
    }
    public IEnt[] getAll()
    {
        return r;
    }

}
