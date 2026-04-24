package revision.designpattern.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * Singleton Design Pattern Implementation
 *
 * Ways to Break Singleton Pattern:
 * 1. Reflection: Private constructor can be accessed via reflection using setAccessible(true)
 * 2. Serialization/Deserialization: Default serialization creates new instances; implement readResolve() to prevent
 * 3. Cloning: Default clone() method creates new instances; override clone() to throw CloneNotSupportedException
 * 4. Multi-threading: Without proper synchronization, multiple threads can create separate instances
 *
 */
public class Singleton implements Serializable, Cloneable {
    public static volatile Singleton instance;

    private Singleton(){
        //Solving reflection issue
        if(instance != null){
            throw new RuntimeException("Use getInstance()");
        }
    }

    //Handling Cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this singleton is not allowed");
    }

    //Solves the Serialization issues
    @Serial
    protected Object readResolve(){
        return instance;
    }

    public static Singleton getInstance(){
        if(instance == null){
            //Solves multiple thread issues
            synchronized (Singleton.class){
                if(instance == null){
                    return  new Singleton();
                }
            }
        }
        return instance;
    }
}
