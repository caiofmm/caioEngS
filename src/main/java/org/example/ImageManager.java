package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ImageManager {
    public static void copyImages(Path imgDir) throws IOException {
        // Aqui você pode copiar imagens do resources/images para output/images
        // Por exemplo, copie manualmente imagens para src/main/resources/images e copie aqui
        // Exemplo:
        // Path source = Path.of("src/main/resources/images/profile.jpg");
        // Path target = imgDir.resolve("profile.jpg");
        // Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        // Para demo, criaremos uma imagem placeholder via URL (você pode substituir)
        // Ou deixe vazio e coloque imagens manualmente
    }
}
