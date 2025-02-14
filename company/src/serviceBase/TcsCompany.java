package serviceBase;

import productBase.GoogleCompany;

public class TcsCompany extends GoogleCompany {

    @Override
    public void productInformation(String productName,String date,String version){
        System.out.println("Tcs Company Product Name :"+productName);
        System.out.println("Date :"+date);
        System.out.println("version :"+version);
        
    }



}
