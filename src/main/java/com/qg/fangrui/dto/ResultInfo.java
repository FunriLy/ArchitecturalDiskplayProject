package com.qg.fangrui.dto;

import lombok.*;

/**
 * Time: Created by FunriLy on 2018/9/11.
 * Motto: From small beginnings comes great things.
 * Description:
 *      DTO 返回对象
 * @author FunriLy
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultInfo<T> {
    /**
     * 状态信息
     */
    private int status;

    /**
     * 状态信息描述
     */
    private String message;

    /**
     * 状态信息对应的内容
     */
    private T info;

    public ResultInfo(int status, String message){
        this.status = status;
        this.message = message;
    }
}
