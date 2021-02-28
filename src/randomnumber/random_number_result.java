/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumber;
import java.util.Random;
/**
 *
 * @author Karta Yu
 */
public class random_number_result {
    private int input_number;
    private int start;
    private int end;
  
    public void set_value(int number, int s, int e){
        this.input_number = number;
        this.start = s;
        this.end = e;
    }
    
    public int [] get_result(){
        int number [] = new int [end - start + 1];
        int result [] = new int [input_number]; 
        int temp = 0, temp2 = 0, temp3 = start;
        Random ran = new Random();
        for(int i = 0; i <= (end - start); i++){
            number[i] = temp3 + 1;
            temp3++;
        }
        for(int i = 0; i < input_number; i++){
            temp = 0; temp2 = 0;
            temp = ran.nextInt((end - start + 1)- i);
            temp2 = number[temp];
            number[temp] = number[(end - start) - i];
            result [i] = temp2;
        }
        return result;
    }
    
    
     
}
