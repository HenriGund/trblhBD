/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trblhBD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henri
 */
public class PessoaController {

    public boolean inserir() {
        String sql = "INSERT INTO PESSOA (cod, nome) VALUES (2, 'Maria'";
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().preparedStatement(sql);
            ps.execute();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        PessoaController pc = new PessoaController();
        boolean resultado = pc.inserir();
        System.out.println("Resultado: " + resultado);
    }

}
