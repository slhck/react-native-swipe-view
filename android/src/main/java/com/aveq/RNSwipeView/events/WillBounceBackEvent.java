package com.aveq.RNSwipeView.events;

import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/**
 * Created by yedidyak on 07/09/2016.
 */
public class WillBounceBackEvent extends Event<WillBounceBackEvent> {

    public WillBounceBackEvent(int viewTag) {
        super(viewTag);
    }

    @Override
    public String getEventName() {
        return "onWillBounceBack";
    }

    @Override
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), null);
    }
}
