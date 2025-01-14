package org.example.beans;

/**
 * @author Chloe
 * @date 2025/01/13
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg) {
        super(msg);
    }
    public BeansException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
