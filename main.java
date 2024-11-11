import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
      int tipoUsuario, respostaTipoAcao, gerenteOUcliente;
      String nome = "Taiane", email= "taiane@usp.br";
      long cpf= 451813848;
      Scanner ler = new Scanner(System.in);
      
      do{
          System.out.println("Digite 1 para logar, 2 para cadastrar");
          respostaTipoAcao = ler.nextInt();
          ler.nextLine();
          int respostaTipoUsuario;
          
            if(respostaTipoAcao==1){
                
                System.out.println("Digite 1 se for gerente e 2 se for cliente");
                respostaTipoUsuario = ler.nextInt();
                
                
                if (respostaTipoUsuario == 1){
                    gerente g = new gerente(cpf, email, nome, respostaTipoUsuario);
                    
                    int respostaGerente;
                    do{
                        
                    System.out.println("MENU");
                    System.out.println("1: Cadastrar avião");
                    System.out.println("2: Alterar dados do avião");
                    System.out.println("3: Excluir avião");
                    System.out.println("4: Cadastrar voo");
                    System.out.println("5: Alterar voo");
                    System.out.println("6: Excluir voo");
                    System.out.println("7: Gerenciar funcionario");
                    System.out.println("8: Gerar Relatórios");
                    System.out.println("9: Sair");

                    
                    respostaGerente = ler.nextInt();
                    
                    int repete = 0 ;
                    if(respostaGerente == 1 ){
                        do{
                            g.cadastraAviao();
                            System.out.println("Deseja cadastrar mais um avião? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                    }else if(respostaGerente == 2){
                        do{
                            System.out.println("Alterar dados de aviao");
                            System.out.println("Deseja alterar mais um avião? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                    }else if(respostaGerente == 3){
                        do{
                            g.excluiAviao();
                            System.out.println("Deseja excluir mais um avião? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                    }else if(respostaGerente == 4){
                        do{
                            g.cadastraVoo();
                            System.out.println("Deseja cadastrar mais um voo? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                    }else if(respostaGerente == 5){
                        do{
                            System.out.println("Alterar dados de voo");
                            System.out.println("Deseja alterar mais um voo? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                        
                    }else if(respostaGerente == 6){
                        do{
                            g.excluiVoo();
                            System.out.println("Deseja excluir mais um voo? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                        
                    }else if(respostaGerente == 7){
                        do{
                            g.cadastraFuncionario();
                            System.out.println("Deseja cadastrar mais um funcionario? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                        

                    }else if(respostaGerente == 8){
                        do{
                            g.geraRelatorio();
                            System.out.println("Deseja gerar mais um relatorio? Digite 1 para sim e 2 para não");
                            repete = ler.nextInt();
                        }while(repete == 1);
                        
                        
                    }else{
                        System.out.println("Opção inválida");
                    }
                    
                    
                        
                    }while(respostaGerente != 9);

                    

                }else if (respostaTipoUsuario == 2){
                    System.out.println("MENU");
                    System.out.println("1: Comprar passagem");
                    System.out.println("2: Cancelar passagem");
                    System.out.println("3: Alterar passagem");
                    System.out.println("4: Fazer checkin");
                    
                    int respostaCliente = ler.nextInt();
                    
                    if(respostaCliente  == 1){
                        
                    }else if(respostaCliente  == 2){
                        
                    }else if(respostaCliente  == 3){
                        
                    }else if(respostaCliente  == 4){
                        
                    }else{
                        System.out.println("Opção inválida");
                    }
                    
                    
                    
                }else{
                    System.out.println("Opção inválida");
                }
               
                
                
            }else if(respostaTipoAcao==2){
                System.out.println("Insira seu nome");
                nome = ler.nextLine();
                
                System.out.println("Insira seu email");
                email = ler.next();
                
                System.out.println("Insira seu CPF");
                cpf = ler.nextLong();
                
                System.out.println("Digite 1 se você for gerente, digite 0 se for usuario");
                gerenteOUcliente = ler.nextInt();
                
                usuario u = new usuario(cpf, email, nome, gerenteOUcliente);
                
                System.out.println("Olá " + u.getNome());
                System.out.println("Você tem permissão de gerente: " + u.getPermissao());
                System.out.println("Enviamos um link para confirmacao de cadastro no seu email " + u.getEmail());

            }else if (respostaTipoAcao !=2 && respostaTipoAcao !=1 ){
                System.out.println("inválido");
            }
          
      }while( respostaTipoAcao  !=2 && respostaTipoAcao  !=1);
  }            
}



