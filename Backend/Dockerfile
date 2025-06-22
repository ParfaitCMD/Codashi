# Etapa 1: Compilação do projeto com Maven e JDK 17
FROM maven:3.9.6-openjdk-17 AS build

# Diretório de trabalho no container
WORKDIR /app

# Copia arquivos do projeto para o container
COPY pom.xml .
COPY src ./src

# Compila o projeto e gera o JAR (sem rodar testes)
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final apenas com JRE para rodar o app
FROM openjdk:17-jdk-slim

# Diretório onde o app será executado
WORKDIR /app

# Copia o JAR compilado da etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta usada pelo Spring Boot (Render injeta via $PORT)
EXPOSE 8080

# Usa a variável de ambiente PORT (Render define ela automaticamente)
ENV PORT=8080

# Comando para rodar o aplicativo
ENTRYPOINT ["java", "-jar", "app.jar"]
