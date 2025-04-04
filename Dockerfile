# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy all Java source files
COPY . .

# Compile all Java files
RUN find . -name "*.java" | xargs javac

# Default command - lists all compiled classes
CMD ["ls", "-R"]
