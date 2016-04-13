package com.lucy.flux.store;

import com.lucy.flux.action.Action;
import com.lucy.flux.utils.Rxbus;

/**
 * <p></p>
 * Created on 2016/4/13 0013 22:09.
 *
 * @author Lucy
 */
public abstract class Store {

    private Rxbus rxbus;

    public abstract void  onNext(Action action);

    //发出更新UI的View
    protected  void post(){

    }
}
