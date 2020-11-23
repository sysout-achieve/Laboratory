package com.company.StringTest;

//100,000
//StringBuffer -> 272629760,
//실행 시간 : 0.217sec
//1,000,000
//StringBuffer -> 272629760,
//실행 시간 : 2.947sec
//10,000,000
//StringBuffer -> 350224384,
//실행 시간 : 27.693sec


//100,000
//StringBuilder -> 272629760
//실행 시간 : 0.219sec
//1,000,000
//StringBuilder -> 272629760
//실행 시간 : 2.586sec
//10,000,000
//StringBuilder -> 350224384
//실행 시간 : 27.811sec

//String -> 721420288
//실행 시간 : 4.393sec
public class StringTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuffer str = new StringBuffer();
        int i =0;
        while (i<10000000){
            str = str.append("world");
            System.out.print(Runtime.getRuntime().totalMemory()+"\n\n\n");
            i++;
        }


//        StringBuilder str = new StringBuilder();
//        int i =0;
//        while (i<10000000){
//            str = str.append("world");
//            System.out.print(Runtime.getRuntime().totalMemory()+"\n\n\n");
//            i++;
//        }


//        String str = "";
//        int i = 0;
//        while (i < 100000) {
//            str = str + "world";
//            System.out.print(Runtime.getRuntime().totalMemory() + "\n\n\n");
//            i++;
//        }

        long end = System.currentTimeMillis();
        System.out.println("실행 시간 : " + (end - start) / 1000.0 + "sec");

    }
}
