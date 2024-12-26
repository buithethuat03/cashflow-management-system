# Sử dụng hình ảnh Java runtime làm base image
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file JAR vào trong container
COPY target/FMCore-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng khi container khởi động
ENTRYPOINT ["java", "-jar", "app.jar"]
