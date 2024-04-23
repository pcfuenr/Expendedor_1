class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m,int cualBebida,Expendedor exp) {
        vuelto = 0;
        if(m==null){
            sonido=null;
            vuelto=0;
        }
        else{
            Bebida b=exp.comprarBebida(m,cualBebida);
            if (b != null) {
                sonido = b.beber();
                if(cualBebida!=Expendedor.COCA&& cualBebida!=Expendedor.SPRITE){
                    vuelto=m.getValor();
                }
                else{
                    while (exp.getVuelto() != null) {
                        vuelto += 100;
                    }
                }
            }
            else{
                sonido=null;
                vuelto=m.getValor();
                while(exp.getVuelto()!=null){
                    exp.getVuelto();
                }
            }
        }
    }
    public int cuantoVuelto(){return vuelto;}
    public String queBebiste(){return sonido;}
}
