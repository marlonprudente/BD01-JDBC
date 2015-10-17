/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessobasico;

import java.sql.*;

public class ListaLivros {

    public static void main(String[] args) throws Exception {
        // carregar driver JDBC
        Class.forName("com.mysql.jdbc.Driver");
        
        // obter conexao
        String url = "jdbc:mysql://100.43.1.160/livraria";
        String user = "root";
        String passwd = "mpo121991";
        Connection con = DriverManager.getConnection(url, user, passwd);
        
        // criar Statement
        Statement stmt = con.createStatement();
        
        // enviar query
        ResultSet rs = stmt.executeQuery("select livro_id, titulo from livros");
        
        // tratar os dados da query
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
        
        // fechar conexao
        con.close();
        
    }
    
}

