package org.zstack.header.message;

/**
 * Created by frank on 10/15/2015.
 */
public interface BeforeDeliveryMessageInterceptor {
    int order();
    void intercept(Message msg);
}
