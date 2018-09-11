package com.qg.fangrui.enums;

/**
 * Time: Created by FunriLy on 2018/9/11.
 * Motto: From small beginnings comes great things.
 * Description:
 *
 * @author FunriLy
 */
public enum  StatusEnum {
    /* 正常 */
    OK(200),
    /* 传入参数异常 */
    PATAMETER_ERROR(210),
    /* 未知错误 */
    ERROR(500);

    private int state;
    StatusEnum(int state){
        this.state = state;
    }

    public int getState(){
        return this.state;
    }
}
