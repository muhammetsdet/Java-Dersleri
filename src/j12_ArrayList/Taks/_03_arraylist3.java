package j12_ArrayList.Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */
public class _03_arraylist3 {
    public static void main(String[] args) {
        List<String> citiesList=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

     getLength(citiesList);
    }
    public static  int getLength(List<String> citiesList) {
           int length=0;
        for (int i = 0; i <citiesList.size() ; i++) {
            length= citiesList.get(i).length();
            System.out.println(citiesList.get(i) + "=" + citiesList.get(i).length());
        }

     return length;
    }
}
