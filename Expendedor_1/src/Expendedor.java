class Expendedor{
    private int precio;
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public Expendedor(int numBebidas,int precioBebidas){
        precio=precioBebidas;
        coca=new Deposito();
        sprite=new Deposito();
        monVu=new DepositoM();
        if(numBebidas==0){precio=0;}
        else{
            for(int i=0;i<numBebidas;i++){
                Bebida b1=new CocaCola(i);
                Bebida b2=new Sprite(i+100);
                coca.addBebida(b1);
                sprite.addBebida(b2);
            }
        }
    }
    public Bebida comprarBebida(Moneda m,int cual) {
        if(m==null){
            return null;
        }
        int p = m.getValor() - precio;
        if (p < 0 || (coca.getBebida()==null&&cual==COCA)||(sprite.getBebida()==null&&cual==SPRITE)) {
            p=m.getValor();
            while (p > 0) {
                monVu.addMoneda();
                p -= 100;
            }
            return null;
        }
        else {
            coca.addBebida(new CocaCola(1));
            sprite.addBebida(new Sprite((2)));
            while (p > 0) {
                monVu.addMoneda();
                p -= 100;
            }
            System.out.print("h");
            if (cual == COCA) {
                return coca.getBebida();
            }else if(cual==SPRITE) {
                return sprite.getBebida();
            }else{
                return null;
            }
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}
