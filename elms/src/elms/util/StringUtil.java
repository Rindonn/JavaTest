/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.util;

/**
 *
 * @author Administrator
 */
public class StringUtil {
    //为空验证
    public static boolean validateNull(String s){
        if(s == "" ||s.length() == 0){
            return false;
        }else{
            return true;
        }
    }
    //数字验证
    public static boolean vaildataDigit(String s){
         //验证数字
        String regex = "^(\\d+)|(\\d+\\.\\d+)$";
        if(s.matches(regex)){
            return true;
        }else{
            return false;
        }
    }
    
}
