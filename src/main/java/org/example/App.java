package com.seuusuario.portfolio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        try {
            Path outputDir = Path.of("output");
            if (!Files.exists(outputDir)) Files.createDirectories(outputDir);

            // Criar subpastas
            Path cssDir = outputDir.resolve("css");
            Path jsDir = outputDir.resolve("js");
            Path imgDir = outputDir.resolve("images");
            Files.createDirectories(cssDir);
            Files.createDirectories(jsDir);
            Files.createDirectories(imgDir);

            // Copiar imagens (você pode colocar imagens na pasta resources/images e copiar aqui)
            ImageManager.copyImages(imgDir);

            // Gerar CSS
            String css = CssBuilder.buildCss();
            Files.writeString(cssDir.resolve("style.css"), css);

            // Gerar JS
            String js = JsBuilder.buildJs();
            Files.writeString(jsDir.resolve("script.js"), js);

            // Gerar HTML
            String html = HtmlBuilder.buildHtml();
            Files.writeString(outputDir.resolve("index.html"), html);

            System.out.println("Portfolio gerado com sucesso na pasta 'output'!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}