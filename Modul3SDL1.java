package com.mycompany.modul3sd;
import java.util.Stack;
/**
 *
 * @author faaareell
 */
public class Modul3SDL1 {

    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push("aku");
        st.push("anak");
        st.push("indonesia");
        
        System.out.println("next : " +st.peek());
        st.push("raya");
        System.out.println(st.pop());
        st.push("!");
        
        int count = st.search("aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
