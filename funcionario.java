import java.util.ArrayList;

public class funcionario extends usuario{
    private String tarefa;
    //private ArrayList voos_designados;
    
    //métodos construtores
    public funcionario( long CPF, String email, String nome, int gerenteOUcliente, String tarefa){
        super(CPF, email, nome, gerenteOUcliente);
        this.tarefa = tarefa;
       // this.voos_designados = null;
        
    }
    
    
    public void setTarefa(String tarefa){
        this.tarefa = tarefa;
    }
    
    
    public String getTarefa(){
        return tarefa;
    }
    
    
    //public void setVoos_designados(voo voos, boolean permissao){
    //    if(permissao=true){
    //        voos_designados.add(voos);
    //    }
    //}
    
    //public String getVoos_designados((){
    //    return voos_designados;
    //}
    
    
}
