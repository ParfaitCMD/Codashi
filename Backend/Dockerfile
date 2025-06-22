# Use imagem oficial do Maven com JDK
FROM maven:3.8.7-openjdk-17 AS build

WORKDIR /app

# Copia arquivos para dentro do container
COPY pom.xml .
COPY src ./src

# Builda o projeto e gera o jar
RUN mvn clean package -DskipTests

# Segunda fase: só o JRE para rodar o app
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copia o jar da build anterior
COPY --from=build /app/target/Backend-0.0.1-SNAPSHOT.jar app.jar

# Porta que seu app vai expor (confira se bate com o app)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
