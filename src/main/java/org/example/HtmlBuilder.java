package com.seuusuario.portfolio;

public class HtmlBuilder {
    public static String buildHtml() {
        return """
            <!DOCTYPE html>
            <html lang="pt-BR">
            <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1" />
                <title>Portfolio Inovador</title>
                <link rel="stylesheet" href="css/style.css" />
            </head>
            <body>
                <header>
                    <h1>Meu Portfolio</h1>
                    <nav>
                        <a href="#home">Home</a>
                        <a href="#about">Sobre</a>
                        <a href="#skills">Habilidades</a>
                        <a href="#projects">Projetos</a>
                        <a href="#contact">Contato</a>
                    </nav>
                </header>
                <main>
                    <section id="home" style="text-align:center;">
                        <img src="images/profile.jpg" alt="Foto de perfil" class="profile-pic" />
                        <h2>Olá, eu sou [Seu Nome]</h2>
                        <p>Desenvolvedor apaixonado por tecnologia e inovação.</p>
                    </section>
                    <section id="about">
                        <h2>Sobre Mim</h2>
                        <p>Tenho experiência em desenvolvimento web e mobile, focado em criar soluções elegantes e eficientes.</p>
                    </section>
                    <section id="skills">
                        <h2>Habilidades</h2>
                        <ul class="skills-list">
                            <li>Java</li>
                            <li>JavaScript</li>
                            <li>React</li>
                            <li>Spring Boot</li>
                            <li>Docker</li>
                            <li>AWS</li>
                        </ul>
                    </section>
                    <section id="projects">
                        <h2>Projetos</h2>
                        <ul class="projects-list">
                            <li>
                                <img src="images/project1.jpg" alt="Projeto 1" class="project-image" />
                                <strong>Gerenciador de Tarefas</strong><br/>
                                Aplicação web para organização de tarefas diárias.
                            </li>
                            <li>
                                <img src="images/project2.jpg" alt="Projeto 2" class="project-image" />
                                <strong>App E-commerce</strong><br/>
                                Aplicativo mobile para compras online com integração de pagamentos.
                            </li>
                        </ul>
                    </section>
                    <section id="contact">
                        <h2>Contato</h2>
                        <p>Email: seu.email@exemplo.com</p>
                        <p>Telefone: +55 11 99999-9999</p>
                    </section>
                </main>
                <footer>
                    &copy; 2024 Meu Portfolio. Todos os direitos reservados.
                </footer>
                <script src="js/script.js"></script>
            </body>
            </html>
            """;
    }
}