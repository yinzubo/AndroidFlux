package com.lucy.flux.dispacher;

import com.lucy.flux.action.Action;
import com.lucy.flux.store.Store;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>用于将Action分发给Store</p>
 * Created on 2016/4/13 0013 22:08.
 *
 * @author Lucy
 */
public class Dispatcher {
    public static Dispatcher instance;

    private List<Store> stores;

    private Dispatcher(){
        stores=new ArrayList<>();
    }

    public static Dispatcher getInstance(){
        if(instance==null){
            instance=new Dispatcher();
        }
        return instance;
    }

    //注册
    public void register(Store store){
        stores.add(store);
    }
    //取消注册
    public void unregister(Store store){
        stores.remove(store);
    }
    //分发
    public void post(Action action){
        if(stores!=null&&!stores.isEmpty()){
            for(Store store:stores){
                store.onNext(action);
            }
        }
    }

}
