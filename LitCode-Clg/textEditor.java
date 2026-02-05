import java.util.*;

class CustomStack {
    StringBuilder text = new StringBuilder();
    Stack <String> history = new Stack<>();
    void insert(String value) {
        history.push(text.toString());
        text.append(value);
    }
    char get (int index) {
        return text.charAt(index-1);
    }
    void delete(int val) {
        history.push(text.toString());
        int newLen = Math.max(0,text.length()-val);
        text.delete(newLen, text.length());
    }
    void undo () {
        if(!history.isEmpty()) {
            text = new StringBuilder(history.pop());
        }
    }
}

public class textEditor {
    public static void main(String[] args) {

        CustomStack editor = new CustomStack();

        // Hardcoded example commands (modify as needed)
        editor.insert("abc");
        editor.insert("def");
        System.out.println(editor.get(3)); // prints 'c'
        editor.delete(2);                  // deletes "ef"
        editor.undo();                     // restores "abcdef"
        System.out.println(editor.get(6)); // prints 'f'
    }
    
}
