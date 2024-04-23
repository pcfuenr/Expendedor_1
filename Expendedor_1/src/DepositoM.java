import java.util.ArrayList;

class DepositoM{
    private ArrayList<Moneda> al;
    public DepositoM(){
        al=new ArrayList<>();
    }
    public Moneda getMoneda(){
        if(al.isEmpty()){
            return null;
        }
        return al.remove(0);
    }
    public void addMoneda(){
        al.add(new Moneda100());
    }
}