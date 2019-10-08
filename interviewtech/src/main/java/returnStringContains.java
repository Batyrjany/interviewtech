public class returnStringContains {

    public static void main(String[] args) {


        System.out.println(returnSTR("xxxblue"));
        System.out.println(returnSTR("xxx"));

        System.out.println(returnSTR("blueTimes"));
        System.out.println(returnSTR("red"));
        System.out.println(returnSTR("redblue"));
        System.out.println(returnSTR("bluered"));


    }


//    public static String returnSTR(String str){
//        String s ="";
//
//        String red = "red";
//        String blue = "blue";
//
//        if(str==null){
//            return null;
//        }else{
//            if(str.contains(red)){
//                s= red;
//            }else if(str.contains(blue)){
//                s= blue;
//            }else{
//                s=s;
//            }
//
//        }
//
//
//
//        return  s;
//    }

    public static String returnSTR(String str) {
        String newstr;

        if(str.startsWith("red")) {
            newstr = "red";
        }else if(str.startsWith("blue")) {
            newstr = "blue";
        } else {
            newstr = "";
        }
        return newstr;
    }



}
