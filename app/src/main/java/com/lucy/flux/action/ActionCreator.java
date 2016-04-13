package com.lucy.flux.action;

import com.lucy.flux.dispacher.Dispatcher;

/**
 * <p>生产Action并将其传递到Dispatch分发</p>
 * Created on 2016/4/13 0013 22:27.
 *
 * @author Lucy
 */
public class ActionCreator {
    private Dispatcher dispatcher;

    public ActionCreator(Dispatcher dispatcher){
        this.dispatcher=dispatcher;
    }
}
