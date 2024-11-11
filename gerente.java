public class gerente extends usuario {
    public gerente(long CPF, String email, String nome, int gerenteOUcliente) {
        super(CPF,  email,  nome, gerenteOUcliente);  
    }

    
    public void cadastraAvião(boolean permissao){
        //if(permissao = true){
        //    aviao a = new aviao();
        //}
    }
    
    public void excluiAvião(boolean permissao, int id){
        //if(permissao = true){
         //   if(aviao.getId() = id && aviao.getAtivo() = 1){
         //       aviao.setAtivo() = 0;
         //  }
        //}
    }
    
    public void cadastraVoo(){
        if(getPermissao() == true){
            voos v = new voos();
        }
    }
    
    public void excluiVoo(){
        if(getPermissao == true){
            if(voos.getId() == id && voos.getAtivo() == 1){
                voos.setAtivo(0) ;
            }
        }
    }
    
    public void alteraVoo(int opcao){
        if(opcao == 1 ){
            voos.setAtivo() = true;
        }else if (opcao == 2 ){
            voos.setId(12) ;
        }else if (opcao == 3 ){
            voos.setDestino("ftytf") ;
        }else if(opcao == 4 ){
            voos.setOrigem("ftytf") ;
        }else if(opcao == 5 ){
            voos.setTime_saida(24)  ;
        }else if(opcao == 6 ){
            voos.setTime_chegada(20)  ;
        }else if (opcao == 7 ){
            voos.setAviao("ftytf") ;
        }else if(opcao == 8 ){
            voos.setPreco_passagem(200, true) ;
        }
        
    }
    
    public void cadastraFuncionario(){
        //if(permissao=true){
        //    funcionario f = new funcionario();
        //}
    }
    
    
    public void geraRelatorio(){
        
    }
}
