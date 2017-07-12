package br.edu.ifpb.praticas.logger;


import br.edu.ifpb.praticas.logger.jdbc.LogJDBCConnectionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

/**
 * Created by diogomoreira on 22/09/16.
 */
public class Loader {

    private static Logger logger = LogManager.getLogger(Loader.class);

    public static void main(String[] args) throws InterruptedException, SQLException {
//        logger.debug("Uma mensagem de debug");
//        logger.info("Uma mensagem de informação");
//        logger.warn("Uma mensagem de alerta");
//        logger.error("Uma mensagem de erro");
//        logger.fatal("Erro crítico do sistema");

        Connection connection = LogJDBCConnectionFactory.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM app_log");
        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getDate(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.println(rs.getString(5) + " ");
        }

    }
}
