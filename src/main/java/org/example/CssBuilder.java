package com.seuusuario.portfolio;

public class CssBuilder {
    public static String buildCss() {
        return """
            /* Reset */
            *, *::before, *::after {
                box-sizing: border-box;
            }
            body {
                margin: 0;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background: linear-gradient(135deg, #667eea, #764ba2);
                color: #f0f0f0;
                min-height: 100vh;
                display: flex;
                flex-direction: column;
            }
            header {
                background: rgba(0,0,0,0.3);
                padding: 1rem 2rem;
                display: flex;
                justify-content: space-between;
                align-items: center;
                backdrop-filter: blur(10px);
                position: sticky;
                top: 0;
                z-index: 100;
            }
            header h1 {
                font-weight: 900;
                font-size: 1.8rem;
                letter-spacing: 2px;
                cursor: default;
            }
            nav a {
                color: #f0f0f0;
                margin-left: 1.5rem;
                text-decoration: none;
                font-weight: 600;
                position: relative;
                transition: color 0.3s ease;
            }
            nav a::after {
                content: '';
                position: absolute;
                width: 0;
                height: 2px;
                bottom: -4px;
                left: 0;
                background-color: #ff6f91;
                transition: width 0.3s;
            }
            nav a:hover, nav a:focus {
                color: #ff6f91;
            }
            nav a:hover::after, nav a:focus::after {
                width: 100%;
            }
            main {
                flex: 1;
                max-width: 900px;
                margin: 3rem auto;
                background: rgba(0,0,0,0.3);
                padding: 2rem;
                border-radius: 12px;
                box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
                backdrop-filter: blur(8px);
                -webkit-backdrop-filter: blur(8px);
                color: #f0f0f0;
            }
            section {
                margin-bottom: 3rem;
            }
            h2 {
                font-size: 2rem;
                border-bottom: 3px solid #ff6f91;
                padding-bottom: 0.5rem;
                margin-bottom: 1rem;
                font-weight: 800;
            }
            p {
                font-size: 1.1rem;
                line-height: 1.6;
            }
            .profile-pic {
                width: 150px;
                height: 150px;
                border-radius: 50%;
                object-fit: cover;
                border: 4px solid #ff6f91;
                margin-bottom: 1rem;
                box-shadow: 0 0 15px #ff6f91;
                transition: transform 0.3s ease;
            }
            .profile-pic:hover {
                transform: scale(1.05);
            }
            .skills-list, .projects-list {
                list-style: none;
                padding: 0;
                display: grid;
                grid-template-columns: repeat(auto-fit, minmax(140px, 1fr));
                gap: 1rem;
            }
            .skills-list li, .projects-list li {
                background: rgba(255 255 255 / 0.1);
                padding: 1rem;
                border-radius: 10px;
                font-weight: 600;
                text-align: center;
                box-shadow: 0 0 10px rgba(255, 111, 145, 0.5);
                transition: background-color 0.3s ease;
                cursor: default;
            }
            .skills-list li:hover, .projects-list li:hover {
                background: rgba(255 111 145 / 0.3);
            }
            .project-image {
                width: 100%;
                max-height: 180px;
                object-fit: cover;
                border-radius: 10px;
                box-shadow: 0 0 15px rgba(255, 111, 145, 0.6);
                margin-bottom: 0.5rem;
                transition: transform 0.3s ease;
            }
            .project-image:hover {
                transform: scale(1.05);
            }
            footer {
                text-align: center;
                padding: 1rem;
                background: rgba(0,0,0,0.3);
                color: #ff6f91;
                font-weight: 600;
                letter-spacing: 1.5px;
                user-select: none;
            }
            @media (max-width: 600px) {
                nav a {
                    margin-left: 1rem;
                    font-size: 0.9rem;
                }
                main {
                    margin: 1rem;
                    padding: 1rem;
                }
                .skills-list, .projects-list {
                    grid-template-columns: repeat(auto-fit, minmax(120px, 1fr));
                }
            }
            """;
    }
}