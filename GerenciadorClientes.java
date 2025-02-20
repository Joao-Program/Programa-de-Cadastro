
package com.mycompany.gerenciadorclientes;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GerenciadorClientes {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regexEmail);
        
        ArrayList<Cliente> ListaClientes = new ArrayList<>();
        
        while(true){
        System.out.println("Digite o nome do Cliente: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o email do Cliente ");
        String email = scanner.nextLine();
        
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            break;
        }else{
            System.out.println("Email invalido. Por favor, digite um Email valido!");
        }
    
        System.out.println("Digite o telefone do Cliente: ");
        String telefone = scanner.nextLine();
        
        if(telefone.matches("^[0-9]+$")){
            break;
        }else{
            System.out.println("Telefone invalido. Por favor, digite um numero de telefone valido.");
        }
        
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
