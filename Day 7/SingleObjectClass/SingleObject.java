package SingleObjectClass;

public class SingleObject {
    private SingleObject(){};
    static final SingleObject obj = new SingleObject();
    SingleObject createInstance(){
        return obj;
    }
}
