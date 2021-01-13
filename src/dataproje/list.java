/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataproje;

/**
 *
 * @author zakir
 */
public class list<AnyType> {
    private int id;
    private Node<AnyType> name;
    private Node<AnyType> surname;
    public list(){
    clear();
    }
 public AnyType get(int idx)
    {
        if(idx < 0 || idx >= id)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + id);
        //array boyutunu aÅŸma hatasÄ± fÄ±rlat
        return getNode(idx).data;//verilen nodu dÃ¶ndÃ¼rÃ¼yor ben de onun datasÄ±nÄ± getiriyorun
    }
        
    public AnyType set(int idx, AnyType newVal)
    {
        if(idx < 0 || idx >= id)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + id);
        
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;     
        p.data = newVal;   
        return oldVal;
    }
    
    public boolean add(AnyType x)
    {
        add(id, x);   
        return true;         
    }
    
    public void add(int idx, AnyType x)
    {
        if(idx < 0 || idx > id)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + id);
        
        Node<AnyType> p = getNode(idx);
        Node<AnyType> newNode = new Node<>( p.prev, x, p );
        newNode.prev.next = newNode;
        p.prev = newNode; 
        
        id++;
    }
         
    public AnyType remove(int idx)
    {
        if(idx < 0 || idx >= id)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + id);
        
        Node<AnyType> p = getNode(idx);
        p.prev.next = p.next;
        p.next.prev = p.prev;
        
        id--;
        
        return p.data;
    }
    
    public int size()
    {
        return id;
    }
    
    public boolean isEmpty()
    {
        return id == 0;
    }
    
    public void clear()
    {
        name = new Node<>(null, null, null);
        surname = new Node<>(name, null, null);
        name.next = surname;
        
        id = 0;
    }
    private Node<AnyType> getNode(int idx)
    {
        Node<AnyType> p;
            
        if( idx <= id / 2 )
        {
            p = name.next;
            for( int i = 0; i < idx; i++ )
                p = p.next;            
        }
        else
        {
            p = surname;
            for( int i = id; i > idx; i-- )
                p = p.prev;
        } 
        
        return p;
    }   
    @Override
    public String toString(){
    String myString="{";
     Node<AnyType> temp = name.next;
        for(int i=0; i<id; i++)
        {    
            myString = myString + temp.data + " ";
            temp = temp.next;
        }    
    myString = myString + "}";
    return myString;
    }
    private class Node<AnyType>{//Generic sınıf olusturuyoruz.
    private Node<AnyType> prev;//node öncesi
    private Node<AnyType> next;//node sonrası
    private AnyType data;//içinde tutulan veri
    
    public Node(Node<AnyType> p, AnyType d, Node<AnyType> n){
    this.prev=p;
    this.next=n;
    this.data=d;
    }

    }
    
}
