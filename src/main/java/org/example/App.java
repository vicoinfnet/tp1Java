package org.example;
import DistanceConverter.DistanceConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        // Log no nível INFO
        logger.info("Iniciando a aplicação");

        try {
            DistanceConverter converter = new DistanceConverter();

            // Log no nível DEBUG
            logger.debug("Convertendo a distância");
            converter.convertAndPrint(11.0);

            // Precisa mudar no logback.xml o nivel para ler os outros log
        } catch (Exception e) {
            // Log no nível ERROR
            logger.error("Erro ao converter distância", e);
        }

        // Log no nível INFO
        logger.info("Aplicação finalizada");
    }
}
