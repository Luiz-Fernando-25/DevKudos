🏆 DevKudos API

"Um sistema de reconhecimento contínuo para equipes de alta performance."

📖 O Problema de Negócio (Por que este projeto existe?)

Em ambientes corporativos e equipes de tecnologia ágeis, o reconhecimento entre pares (Kudos) muitas vezes se perde em mensagens informais de chat ou e-mails que logo são esquecidos. A falta de um registro oficial de bons feedbacks impacta o engajamento e dificulta avaliações de desempenho justas.

A DevKudos API resolve esse problema centralizando o reconhecimento. Ela permite que desenvolvedores, analistas de suporte e gestores enviem e consultem elogios oficiais ("Kudos") atrelados a colaboradores específicos, promovendo uma cultura de feedback transparente e gamificada.

🚀 Tecnologias e Arquitetura

O projeto foi construído focando na simplicidade de execução inicial, mas com base estrutural para escalar:

Java 17: Uso das features modernas da linguagem e suporte LTS (Long-Term Support).

Spring Boot (Web, Data JPA): Framework principal escolhido pela sua robustez e padrão de mercado corporativo para construção de APIs RESTful.

H2 Database: Banco de dados relacional em memória, permitindo que a aplicação seja testada e validada rapidamente sem a necessidade de infraestrutura externa (Containers/SGBDs) neste primeiro momento.

Maven: Gerenciador de dependências e build da aplicação.

⚙️ Como Executar o Projeto Localmente

Clone o repositório:

git clone [https://github.com/luiz-fernando-25/devkudos.git](https://github.com/luiz-fernando-25/devkudos.git)



Entre na pasta do projeto:

cd devkudos



Execute a aplicação utilizando o Maven Wrapper (sem precisar instalar o Maven na máquina):

# Usuários de Windows
mvnw.cmd spring-boot:run

# Usuários de Linux/Mac
./mvnw spring-boot:run



A API estará disponível e escutando na porta padrão: http://localhost:8080

📡 Endpoints Disponíveis

A API expõe recursos para gerenciamento de Usuários e envio de Kudos.

Usuários (/usuarios)

Método

Rota

Descrição

GET

/usuarios

Retorna a lista de todos os usuários cadastrados.

GET

/usuarios/{id}

Busca os detalhes de um usuário específico pelo ID.

POST

/usuarios

Cadastra um novo usuário no sistema.

DELETE

/usuarios/{id}

Remove um usuário do sistema.

Kudos (/kudos)

Método

Rota

Descrição

GET

/kudos

Retorna o feed geral com todos os Kudos enviados.

GET

/kudos/destino/{id}

Lista todos os Kudos recebidos por um usuário específico (Feed pessoal).

POST

/kudos

Registra o envio de um novo Kudo (de um usuário de origem para um de destino).

🔜 Roadmap de Evolução Técnica

Este projeto está em desenvolvimento ativo e contínuo, servindo como base para aplicação de padrões arquiteturais avançados. Os próximos passos incluem:

$$$$

 Fase 1 (Arquitetura Limpa): Implementação da Camada de Serviços (@Service), isolando lógicas de negócio dos Controllers.

$$$$

 Fase 2 (Segurança de Dados): Criação de DTOs (Data Transfer Objects) e implementação de Bean Validation para sanitização de entradas.

$$$$

 Fase 3 (Segurança): Autenticação e Autorização utilizando Spring Security e JWT.

$$$$

 Fase 4 (Infraestrutura): Containerização da aplicação com Docker (Dockerfile).

Desenvolvido por Luiz Fernando como parte da transição de carreira e aprofundamento em Engenharia de Software com Java.

⚠️ Nota de Transparência: A fundação inicial deste repositório foi construída através de uma prática assistida (estudo guiado/tutorial). A partir desta base funcional, o código está sendo ativamente refatorado e expandido com arquitetura limpa, boas práticas e padrões corporativos independentes.
