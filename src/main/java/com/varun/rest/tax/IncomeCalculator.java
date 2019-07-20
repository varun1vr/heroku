package com.varun.rest.tax;

public class IncomeCalculator {

    public static void main(String []args){
        TaxBracket taxBracket1 = new TaxBracket(10,300000,600000);
        TaxBracket taxBracket2 = new TaxBracket(20,600000,900000);
        TaxBracket taxBracket3 = new TaxBracket(30,900000,600000);
        float taxForSlab1 = new TaxBracket(10,300001,600000).getTax();
        float taxForSlab2= new TaxBracket(20,600001,900000).getTax();
        //float taxForSlab3 = new TaxBracket(10,300001,600000).getTax();

        float tax = 90000;
        float amount =0;
        if(tax >= taxBracket1.getTax()){
            taxBracket1.setTax(taxBracket1.getTax());
            amount =amount+ taxBracket1.getAmount();
            tax = tax-taxBracket1.getTax();
            System.out.println(tax);
            System.out.println(amount);

        }if(tax >= taxBracket2.getTax()){
            taxBracket2.setTax(taxBracket2.getTax());
            amount =amount+ taxBracket2.getAmount();
            tax = tax-taxBracket1.getTax();
            System.out.println(tax);
            System.out.println(amount);

        }{
            taxBracket3.setTax(tax);
            amount =amount+ taxBracket2.getAmount();
            System.out.println(tax);
            System.out.println(amount);

        }
        System.out.println(amount+100000);
    }
}
