package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.*;//JOptionPane
import java.io.*;
import entities.Jogadores;
import entities.Emprestimo;
import entities.Clube;
import entities.Definitivo;


@SuppressWarnings("unused")
public class Program {
	
    public static void main (String[] args){
		Locale.setDefault(Locale.US);
    	Scanner sc= new Scanner(System.in);
		List<Jogadores> list = new ArrayList<>(); 
		
		List<Clube> list1 = new ArrayList<>();
		
		
		
        int menu ;
        
    	do {
    		
    		menu= Integer.parseInt(JOptionPane.showInputDialog("Escolha um programa: "
    		     
             +  "\n 1 -Cadastrar Dados do Clube\n"
             +  " 2 -Cadastrar  Jogadores\n"
             +  " 3 -Atualizar   Jogadores\n"
             +  " 4 -Atualizar Dados do   Clube\n"
             + " 5 -Remover Jogadores\n "
             +  "6 -Listar Jogadores\n "
             +  "7 -Listar Dados do Clube\n"
             +  " 8 -Sair\n"
             +  "Digite uma opção:") );

    		 
            switch(menu){ 
            	case 1:  //* cadastro de clube*/
            		
            		//sc.nextLine();
        			String nome_clube = JOptionPane.showInputDialog(null,"Informe o nome do clube: "); 
        		    //sc.nextLine();
        			String estadio = JOptionPane.showInputDialog(null,"Informe o estadio do clube: ");
        		    //sc.nextLine();
        			String cidade = JOptionPane.showInputDialog(null,"Cidade: ");
        			//sc.nextLine();
        			String treinador = JOptionPane.showInputDialog(null,"Informe o treinador: ");
        			//sc.nextLine();
        			 list1.add(new Clube(nome_clube,estadio, cidade,  treinador));
        			 break; //*encerra o  cadastro e "força" o programa voltar ao menu*/
        			//
            	case 2:
            		//int n= JOptionPane.showInputDialog("Entre com número de jogadores que você deseja cadastrar: ");
            		int n= Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com número de jogadores que você deseja cadastrar: "));
            		//int n = sc.nextInt();
            		for (int i=1;i<=n;i++) {
            			
            			JOptionPane.showMessageDialog(null, "Jogador #: " + i);
            			
            			
            			String nome_jogador=JOptionPane.showInputDialog(null,"Nome do jogador ");
            			
            			
            		 
            		 int idade =Integer.parseInt(JOptionPane.showInputDialog(null, "Idade "));
            		
            		 
            		 double altura =Double.parseDouble(JOptionPane.showInputDialog(null, "altura "));

            			
            		 
            		 String pe  =JOptionPane.showInputDialog(null,"pé ");

            			
            			
            			String posicao=JOptionPane.showInputDialog(null,"posicão");

            			
            		
            			
               		 int camisa  =Integer.parseInt(JOptionPane.showInputDialog(null, "camisa "));

            			
            		   
               		 
            		 String nacionalidade  =JOptionPane.showInputDialog(null,"nacionalidade");
            		 
            		 
            		 
         			
         			String tipo = JOptionPane.showInputDialog("Tipo de transferencia; Emprestimo(E), Definitivo(D):  ");

            			
            		    if(tipo.equals("E")) {
            		    	
                   		  double valor =Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));

            		    	
                   		 
                		 String antigo_clube   =JOptionPane.showInputDialog(null,"Antigo clube ");

                			
                			
                			
                   		 String duracao   =JOptionPane.showInputDialog(null,"Duração do empréstimo ");

                			
                			
                   		 
                   		 String obrigacao_de_compra   =JOptionPane.showInputDialog(null,"Obrigação de compra: ");

                			
                			list.add(new Emprestimo(nome_jogador,  idade, altura,  pe, posicao,  camisa,
                					 nacionalidade, valor, antigo_clube,  duracao, obrigacao_de_compra));  /**polimorfismo*/
                			
                			
                		
            		    }
            		    
            		    
            		    if(tipo.equals("D")) { 
            		    	
            		    	
                      		 double valor =Double.parseDouble(JOptionPane.showInputDialog(null, "Valor: "));

            		    	
            		    
                			
                   		 String antigo_clube   =JOptionPane.showInputDialog(null,"Antigo clube ");

                			
                			
                			
                		
                   		 
                   		 String duracao   =JOptionPane.showInputDialog(null,"Duração do contrato ");

                			
                
                			list.add(new Definitivo(nome_jogador,  idade, altura,  pe, posicao,  camisa,
                					 nacionalidade, valor, antigo_clube,  duracao));
                			
                			
            		    	
            		    }
            		    
            		    
            			
           		}
            		
            	break;	
            		
            	case 3:   /** atualização da idade e das camisas dos jogadores */
            		for(int i=0; i<list.size();i++) {
            			Jogadores xjogadores=list.get(i);
            			JOptionPane.showMessageDialog(null, "["+ i+ "]" +xjogadores.getNome_jogador());
            			
            
            		}
            		
            		
            		
            	
            		
            		
            		int referencia= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite de referencia "));

                    
                    
            		
            		int NovaIdade= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nova idade "));

                    
                    
            		int NovaCamisa= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nova numeração de camisa"));

                    
        			Jogadores x =list.get(referencia);
                    
                    x.setIdade(NovaIdade);
                    x.setCamisa(NovaCamisa);
                    

                    break;
                    
            	case 4://* atualizar dados do clube */
            		
            		for(int i=0; i<list1.size();i++) {
            			Clube u=list1.get(i);
            			JOptionPane.showMessageDialog(null, "["+ i+ "]" +u.getNome_clube());
            
            		}
            		
            		
            		
            		
            		
            		int referencia1= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite de referencia "));

                    
                  
            		
        			String NovoTecnico = JOptionPane.showInputDialog(null,"Informe o novo treinador: ");

                    
        			Clube u =list1.get(referencia1);
                    
                    u.setTreinador(NovoTecnico);
            		
                    
                    
            		
            		
                     break;
                     
            	case 5:  //*remover jogador cadastrado */
            		
            		for(int i=0; i<list.size();i++) {
            			Jogadores xjogadores=list.get(i);
            			JOptionPane.showMessageDialog(null, " ["+ i+ "] " +xjogadores.getNome_jogador());
            			
            			
            
            		}
            		
            		int valor= Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de referencia "));

            		
                    list.remove(valor);
                    
                    break;
                    
            	case 6:     
            		
            		for(int i=0; i<list.size();i++){
            			
            			Jogadores a = list.get(i);
            			n=i+1;
            			
            			JOptionPane.showMessageDialog(null,"\nJogador #"+ n  + "\nNome:"+ a.getNome_jogador() +"\nCamisa:"+ a.getCamisa()+"\nIdade:"+ a.getIdade());

            			

            			
            		}
            		
            		break;
            	case 7:  /* exibir clube */
            		for(int i=0 ; i<list1.size();i++) {
            			Clube u1 = list1.get(i);
            			
            			
            			JOptionPane.showMessageDialog(null, "\nNome do Clube:"+ u1.getNome_clube() + " \n Treinador:" + u1.getTreinador());
            			
            		}
                   break;
            	case 8:
            		JOptionPane.showMessageDialog(null,"Programa encerrado");
            		break;
                   default:
                	   JOptionPane.showMessageDialog(null,"invalido");
                	  break;
            		
            }
            
            
         
    		
    	}while(menu!=8);
    	
    	sc.close();
    }
    	

}
