package com.jb.com.jb.utils;

public class StringUtils {
    private String _string;
    private Boolean _isString;
    public void set_string(String pString){
        if(pString instanceof String){
            _string=pString;
            _isString=true;
        }
    }
    public String get_string(){
        if(_isString=true){
            return _string;
        }
        else{
            return "type non valide";
        }
    }
}
