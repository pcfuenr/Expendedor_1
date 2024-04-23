import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> al;
    public Deposito(){
        al=new ArrayList<>();
    }
    public Bebida getBebida(){
        if(al.isEmpty()){
            return null;
        }
        return al.remove(0);
    }
    public void addBebida(Bebida b){
        al.add(b);
    }
}