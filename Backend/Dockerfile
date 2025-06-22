# Stage 1: build usando imagem oficial do Maven com JDK 17
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia arquivos essenciais primeiro para cache melhor
COPY pom.xml .

# Baixa dependências antes do código, para usar cache Docker
RUN mvn dependency:go-offline

# Copia o código fonte
COPY src ./src

# Compila e empacota o app, pulando testes para acelerar build
RUN mvn clean package -DskipTests

# Stage 2: imagem leve só para rodar o app
FROM eclipse-temurin:17-jre-focal

WORKDIR /app

# Copia o JAR compilado do estágio anterior
COPY --from=build /app/target/*.jar app.jar

# Expõe a porta padrão (Render vai usar variável $PORT automaticamente)
EXPOSE 8080

# Variável de ambiente para compatibilidade com Render
ENV PORT=8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
