
package com.mycompany.gerenciadorclientes;

public class Cliente {
    public String nome;
    public String email;
    public String telefone;
    public int ID;
    
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void exibirCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
    
}
