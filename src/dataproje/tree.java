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
public class tree {
class Node{
    int icerik ;
    Node sol,sag;
    Node(int icerik){		
        this.icerik = icerik ;
        sol=sag=null;
}
public class BinarySearchTree {
    Node kok ;
    String ino = " ";
    String pre = " ";
    String post = " ";
    public BinarySearchTree() {
    kok = null;
    }
    
    // Ağaç'ta sağ yaprak boş olmayana kadar gidersek, ulaştığımız en sağdaki yaprak en büyük sayımızdır.
    Node Max(){
        Node sonuc = kok;
        while(sonuc.sag!=null){
            sonuc= sonuc.sag;
        }
        return sonuc;
    }
    
    // Ağaç'ta sol yaprak boş olmayana kadar gidersek, ulaştığımız en soldaki yaprak en küçük sayımızdır.
    Node Min(){
        Node sonuc = kok;
        while(sonuc.sol!=null){
            sonuc= sonuc.sol;
        }
        return sonuc;
    }
    
    // Recursive inorder sıralama(Küçükten büyüğe)
    void inorder(Node d){
        if(d.sol!=null){
            inorder(d.sol);
        }
        ino += d.icerik + " ";
        if(d.sag!=null){
            inorder(d.sag);
        }
    }
    
    void preOrder(Node d){
        pre += d.icerik + " ";
        if(d.sol!=null){
            preOrder(d.sol);
        }
        if(d.sag!=null){
            preOrder(d.sag);
        }
    }
    
    void postOrder(Node d){
        if(d.sol!=null){
            postOrder(d.sol);
        }
        if(d.sag!=null){
            postOrder(d.sag);
        }
        post += d.icerik + " ";
    }
    
    // Ekleme yaparken gelen sayı ile karşılaştırıyoruz.
    // Eğer sayımız root'dan(kök) başlayıp tüm alanlara baka baka büyükse sağa değilse sola doğru kaydırıyoruz.
      public void add(Node yeni){
		
        Node y = null;
        Node x = kok;
        
        while(x!=null){
            y = x ;
            if(yeni.icerik < x.icerik){
                x = x.sol;
            }
            else {
                x = x.sag;
            }
        }
        
        if(y==null){
            kok = yeni ;
        }
        
        // Sonrasında bulduğumuz konumda eğer küçükse soluna büyükse sağına ekliyoruz.
        else if(yeni.icerik < y.icerik){
            y.sol = yeni ;
        }
        else y.sag = yeni;
    }
    
    // Arama işleminde küçükse büyükse karşılaştırmaları yaparak geziniyoruz.
    Node search(int eleman){
        Node d = kok;
        while(d!=null){
            if(d.icerik == eleman){
                return d ;
            }
            else if(eleman < d.icerik){
                d = d.sol;
            }
            else d = d.sag;        
    }
       return null;
}    
    
    // Burdada istenen sayıya kadar geziniyoruz.
    // Sonrasında sol boş olmayana kadar gidip en büyüğünü alıp y'ye
    // Eğer sağ taraf boş değilse en sağına kadar gidip en küçüğünü alıp y'ye eşitliyoruz.
    // Bu şekilde yaptıktan sonra bulduğumuz yeri istediğimiz/aradığımız sayının üstüne yazarak onu silmiş/kaldırmış oluyoruz.
    void delete(int istenen){
        Node y = null;
        Node x = kok;
        
        while(x.icerik!=istenen){
            if(x.icerik>istenen){
                x = x.sol;
            }
            else x = x.sag;
        }
        
        while(true){
            if(x.sol!=null){
              //  y = x.sol.max();
            }
            if(y==null && x.sag!=null){
             //   y = x.sag.min();
            }
            if(y==null){
                break;
            }
            x.icerik = y.icerik ;
            x=y;
        }               
      }
    }
  }
}
