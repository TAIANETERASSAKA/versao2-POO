public class usuario{
    private long CPF;
    private String email ;
    private String nome;
    private boolean permissao;
    
    //métodos construtores
    public usuario(long CPF, String email, String nome, int gerenteOUcliente){
        this.CPF = CPF;
        this.email = email;
        this.nome = nome;
        if(gerenteOUcliente == 1){
            this.permissao = true;
        }else{
            this.permissao = false;
        }
    }
    
    //métodos getters
    public long getCPF(){
        return CPF;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public boolean getPermissao(){
        return permissao;
    }

    //metodos setters
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
        
    public void setCPF(long CPF){
        this.CPF = CPF;
    }    
    

    //metodos abstratos
    
    
}
