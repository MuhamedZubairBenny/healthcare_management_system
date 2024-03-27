package za.ac.cput.repository;

// Author: Muhamed Zubair Benny - 220527636

public interface IRepository  <T, ID>{
    T create (T t);

    T read (ID id);

    T update (T t);

    boolean delete (ID id);
}
