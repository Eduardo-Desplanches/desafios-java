package Desafio6;

import java.util.LinkedList;
import java.util.List;

public class ListaNinja<T>{

    private  LinkedList<T> listaNinja;

    public ListaNinja(){
        this.listaNinja = new LinkedList<>();
    }

    public void adicionarNinja(T ninja){
        listaNinja.offer(ninja);
    }

    public void adicionarPrimeiroNinja(T ninja){
        listaNinja.addFirst(ninja);
    }

    public void retirarPrimeiroNinja(){
        listaNinja.removeFirst();
    }

    public T mostrarPrimeiro(){
        return listaNinja.peek();
    }

    public LinkedList<T> getListaNinja() {
        return listaNinja;
    }

    public void setListaNinja(LinkedList<T> listaNinja) {
        this.listaNinja = listaNinja;
    }

    @Override
    public String toString() {
        return "ListaNinja{" +
                "listaNinja=" + listaNinja +
                '}';
    }
}
