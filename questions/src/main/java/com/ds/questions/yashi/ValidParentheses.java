/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: "(]"
 * Output: false
 * <p>
 * Example 4:
 * Input: "([)]"
 * Output: false
 * <p>
 * Example 5:
 * Input: "{[]}"
 * Output: true
 */
package com.ds.questions.yashi;

import java.util.Stack;

/**
 * @author Aniket Kulkarni
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("("));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("(){"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("{([{}])}"));


    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        if(chars.length<=1){
            return false;
        }
        Stack<Character> characterStack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '{' || chars[i] == '(' || chars[i] == '[') {
                characterStack.push(chars[i]);
            }else if(chars[i]=='}'){
                if(characterStack.peek()=='{'){
                    characterStack.pop();
                }else{
                    return false;
                }
            }else if(chars[i]==']'){
                if(characterStack.peek()=='['){
                    characterStack.pop();
                }else{
                    return false;
                }
            }else{
                if(characterStack.peek()=='('){
                    characterStack.pop();
                }else{
                    return false;
                }
            }
        }

        if (characterStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}