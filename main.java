import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
      int tipoUsuario, respostaTipoAcao, gerenteOUcliente;
      String nome, email;
      long cpf;
      Scanner ler = new Scanner(System.in);
      
      do{
          System.out.println("Digite 1 para logar, 2 para cadastrar");
          respostaTipoAcao = ler.nextInt();
          ler.nextLine();
          int respostaTipoUsuario;
          
            if(respostaTipoAcao==1){
                
                System.out.println("Digite 1 se for gerente e 2 se for cliente");
                respostaTipoUsuario = ler.nextInt();
                
                
                if (respostaTipoUsuario == 1 || respostaTipoUsuario == 3){
                    System.out.println("MENU");
                    System.out.println("1: Cadastrar avião");
                    System.out.println("2: Alterar dados do avião");
                    System.out.println("3: Excluir avião");
                    System.out.println("4: Cadastrar voo");
                    System.out.println("5: Alterar voo");
                    System.out.println("6: Excluir voo");
                    System.out.println("7: Gerenciar funcionario");
                    System.out.println("8: Gerar Relatórios");
                    
                    int respostaGerente = ler.nextInt();
                    
                    if(respostaGerente == 1 ){
                        int id_aviao, ano_aviao, capacidade_aviao_passageiros;
                        String modelo_aviao;
                        
                        
                         System.out.println("Cadastro de  avião");
                         System.out.println("Informe o id do avião");
                         id_aviao = ler.nextInt();
                         System.out.println("Informe o ano de fabricacao avião");
                         ano_aviao = ler.nextInt();
                         System.out.println("Informe o capacidade de passageiros do avião");
                         capacidade_aviao_passageiros = ler.nextInt();
                         System.out.println("Informe o modelo do avião");
                         modelo_aviao = ler.next();
                         
                         aviao a = new aviao(id_aviao, modelo_aviao, ano_aviao, capacidade_aviao_passageiros);
                         
                        System.out.println("O avião cujo o identificador é: " + a.getId() + " foi cadastrado com sucesso!");
                        System.out.println("Informacões do avião: ");
                        System.out.println("Modelo: " + a.getModelo());
                        System.out.println("Ano de fabricacão: " + a.getAno());
                        System.out.println("Capacidade de passageiros: " + a.getCapacidade());
                        System.out.println("Status: " + a.getAtivo());
                         
                         
                        
                    }else if(respostaGerente == 2){
                        System.out.println("Alterar dados de  avião");

                         
                         
                        
                    }else if(respostaGerente == 3){
                        System.out.println("Excluir avião");
                        
                    }else if(respostaGerente == 4){
                        int id_voo, time_saida_voo, time_chegada_voo;
                        String destino_voo, origem_voo, status_voo;
                        float preco_passagem;
                        
                        System.out.println("Cadastro de voo");
                        System.out.println("Informe o id do voo");
                        id_voo = ler.nextInt();
                        System.out.println("Informe o data de saida");
                        time_saida_voo = ler.nextInt();
                        System.out.println("Informe o data de chegada");
                        time_chegada_voo = ler.nextInt();
                        System.out.println("Informe o origem do voo");
                        origem_voo = ler.next();
                        System.out.println("Informe o destino do voo");
                        destino_voo = ler.next();
                        System.out.println("Informe o status do voo");
                        status_voo = ler.next();
                        System.out.println("Informe o preco da passagem do voo");
                        preco_passagem = ler.nextFloat();
                        
                        voos v = new voos(id_voo, destino_voo, origem_voo, status_voo, time_saida_voo, time_chegada_voo, preco_passagem );
                        
                        System.out.println("O voô cujo o identificador é: " + v.getId() + " foi cadastrado com sucesso!");
                        System.out.println("Informacões do voo: ");
                        System.out.println("Origem: " + v.getOrigem());
                        System.out.println("Destino: " + v.getDestino());
                        System.out.println("Data saída: " + v.getTime_saida());
                        System.out.println("Data chegada: " + v.getTime_chegada());
                        System.out.println("Preço base da passagem: " + v.getPreco_passagem());
                        System.out.println("Status: " + v.getStatus());
                        System.out.println("Ativo: " + v.getAtivo());
                        
                        
                        
                    }else if(respostaGerente == 5){
                        System.out.println("Alterar dados de voo");
                        
                    }else if(respostaGerente == 6){
                        System.out.println("Excluir voo");
                        
                    }else if(respostaGerente == 7){
                        System.out.println("Gerenciar funcionario");
                        long cpf_funcionario;
                        String email_funcionario, nome_funcionario, tarefa;
                        int gerenteOUcliente_funcionario = 2;

                        
                        System.out.println("Cadastro de funcionário");
                        System.out.println("Informe o CPF do funcionário");
                        cpf_funcionario = ler.nextLong();
                        ler.nextLine();
                        System.out.println("Informe o nome do funcionário");
                        nome_funcionario = ler.nextLine();
                        System.out.println("Informe o email do funcionário");
                        email_funcionario = ler.next();
                        System.out.println("Informe o tarefa do funcionário");
                        tarefa = ler.next();
                        
                        funcionario f = new funcionario(cpf_funcionario, email_funcionario, nome_funcionario, gerenteOUcliente_funcionario, tarefa);
                        
                        System.out.println("O funcionario: " + f.getNome() + " foi cadastrado com sucesso!");
                        System.out.println("Informacões do funcionario: ");
                        System.out.println("CPF: " + f.getCPF());
                        System.out.println("Email: " + f.getEmail());
                        System.out.println("Tarefa: " + f.getTarefa());
                        System.out.println("Permissão: " + f.getPermissao());

                        
                        
                    }else if(respostaGerente == 8){
                        int tipoLista;
                        
                        System.out.println("Gerar Relatórios");
                        System.out.println("1: Lista de todos aviões");
                        System.out.println("2: Lista de todos voos");
                        System.out.println("3: Lista de todos clientes");
                        System.out.println("4: Lista de todos passageiros do voo X");
                        
                        tipoLista = ler.nextInt();
                        
   
                    }else{
                        System.out.println("Opção inválida");
                    }

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


