package Generic;

public class TypeSaftey <T>{
    T value;
    void set(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
}