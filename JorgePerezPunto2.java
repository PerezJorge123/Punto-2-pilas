import java.util.Stack;
import java.util.Scanner;

public class JorgePerezPunto2 {
    Scanner sc = new Scanner(System.in);

    public void ejecutarPunto2 () {
        JorgePerezPunto2 o = new JorgePerezPunto2();
        Stack<Character> p = new Stack<>();
        Stack<Character> r = new Stack<>();
        String oracion = "";
        System.out.println("ingresa una cadena de caracteres");
        oracion = sc.nextLine();
        o.pila(oracion, p);
        System.out.println("cadena original" + p);
        o.revertir(p, r);
        System.out.println("cadena invertida" + r);
    }
    
    public Stack<Character> pila (String c, Stack<Character> p) {
        for (int i = 0; i < c.length(); i++) {
            p.push(c.charAt(i));
        }
        return p;
    }

    public Stack<Character> revertir (Stack<Character> p, Stack<Character> r) {
        int longitud = p.size();
        for (int i = 0; i < longitud; i++) {
            r.push(p.pop());
        }
        return r;
    }
}