FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY src/ /app/src/
RUN javac src/biblio/*.java
WORKDIR /app/src
CMD ["java", "biblio.TestBibliotheque"]