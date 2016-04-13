package com.lucy.flux.action;

/**
 * <p></p>
 * Created on 2016/4/13 0013 22:14.
 *
 * @author Lucy
 */
public class Action<T> {
    private String type;
    private T data;

    public Action(String type,T data){
        this.type=type;
        this.data=data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return this.data;
    }
}
