package com.zubaer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] input = S.split(" ");
        String resultText = "";
        char[] vowelArray = {'a','A','E','e','i','I','o','O','u','U'};
        for (String word : input){
            char firstLetter = word.charAt(0);
            int check = 0;
            for (int i =0;i<vowelArray.length;i++){
                if (firstLetter==vowelArray[i]){
                    resultText=resultText+(word+"ma"+" ");
                    check++;
                }
            }
            if (check==0){
                String str = word.substring(1);
                resultText=resultText+(str+firstLetter+"ma"+" ");
            }
        }
        String[] data = resultText.split(" ");
        String j="a";
        String resultFinal ="";
        for (int i=0; i<data.length;i++){
            String s1=data[i];
            System.out.println(data[i]);
            //String s2 = j+"a";
            s1=s1+j;
            data[i]=s1;
            j=j+"a";
            resultFinal=resultFinal+s1+" ";
        }
        System.out.println("-------------------");
        resultFinal = resultFinal.substring(0,resultFinal.length()-1);
        System.out.println(resultFinal);
    }
}
