package com.parasoft;

import com.parasoft.interfaces.IConvertor;

public class Convertorm implements IConvertor {
    public String convertToString(int a) {
        return String.valueOf(a);
    }


    public String nickname() {
      	System.out.println("This is for luffy ");
        return "number to string convertor";
        
    }

    @Override
    public String name() {
      	System.out.println("This is for luffy ");
        return "";
      
    }
}
