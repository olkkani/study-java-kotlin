package io.olkkani.datatype;

public class StringType {
    public static void main(String[] args) {


        // what happen string add int
        StringType stringType = new StringType();
        stringType.StringAddInt("56", 4);
    }


    private void StringAddInt (String var1, int var2) {
        System.out.println((var1 + var2));
    }
}



