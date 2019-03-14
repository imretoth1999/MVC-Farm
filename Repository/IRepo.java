package Repository;

import Domain.*;

public interface IRepo {
    void add(IEnt e) throws MyException;
    void remove(int p)throws MyException;
    IEnt[] getAll();
    int getPos();
}
