/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwith.string;

/**
 *
 * @author SHEKHAR
 */
public class WorkingWithString {

 
    public static void main(String[] args) {
    String A = new String(" Hallo Aunty ");
    System.out.println(A.length());//   .length
    System.out.println(A.toUpperCase());//  .toUpperCase
    System.out.println(A.toLowerCase());//  .toLowerCase
    System.out.println(A.replace(" ","*"));//   .replace(char,char)    
/*You can also use the ffg : 
    .charAt
    .replaceAll(String,String)
    */
    }
    
}
