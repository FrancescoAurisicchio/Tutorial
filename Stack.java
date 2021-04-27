package Array;

public class Stack {

 private int size;
 private String[] elements;
 public static final int DEFAULT_SIZE = 30;

    /**
     * Costruttore senza parametro, imposta l' arrey a 30
     */
    public Stack(){
        elements= new String[DEFAULT_SIZE];
    }

    /**
     * Costruttore con parametro, imposta la capacita' massima
     * @param maxSize
     */
         public Stack(int maxSize) {
         elements = new String[maxSize];
         }

    /**
     * Metodo che inserisce un valore nello stack (push)
     * @param el
     */
         public void push(String el) {
            if (size >= elements.length) {
             String[] temp = new String [elements.length * 2];
             System.arraycopy(elements, 0, temp, 0, elements.length);
             elements = temp;
             }
         elements[size++] = el;
         }

    /**
     * Metodo che ritorna il valore in cima allo stack senza rimuoverlo (peek)
     * @return
     */
         public String peek(){
            if (isEmpty()) {
                return "lo stack e' vuoto";
            }
            return elements[size - 1];
         }

    /**
     * Metodo che ritorna il valore in cima allo stack rimuovendolo (pop)
     * @return
     */
        public String pop() {
         return elements[--size];
         }

    /**
     * Metodo che controla se lo stack e' vuoto
     * @return
     */
         public boolean isEmpty() {
         return size == 0;
         }

         public int getSize() {
         return size;
         }
 }