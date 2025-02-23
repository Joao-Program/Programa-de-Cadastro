
package com.mycompany.gerenciadorclientes;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorClientes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Cliente> ListaClientes = new ArrayList<>();
        
        while(true){
        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o email do Cliente ");
        String email = scanner.nextLine();
        
        System.out.println("Digite o telefone do Cliente: ");
        String telefone = scanner.nextLine();
               
        Cliente cliente = new Cliente(nome, email, telefone);
        
        ListaClientes.add(cliente);
        
            System.out.println("Cliente cadastrado com sucesso!");
            
            System.out.println("Deseja cadastrar outro cliente? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("n")) {
                break;
            }  
    }
        
        if(ListaClientes.isEmpty()){
            System.out.println("O cadastro está vazio.");
        }else{
            System.out.println("\nClientes cadastrados:");
            for(Cliente c : ListaClientes) {
                c.exibirCliente();
        }
        
        scanner.close();
        }
    }
}
