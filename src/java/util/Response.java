/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lol
 */
public class Response {

    private int code;
    private String msg;
    private Map<String, Object> data;

    public Response() {
        data = new HashMap();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public void addDate(String key, Object obj) {
        data.put(key, obj);
    }

    public Object getDate(String key) {
        return data.get(key);
    }

    @Override
    public String toString() {
        return "Response{" + "code=" + code + ", msg=" + msg + ", data=" + data + '}';
    }

}
