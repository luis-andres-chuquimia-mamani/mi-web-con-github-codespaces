FROM ibm-semeru-runtimes:open-jdk-25.0.1_8-jdk
WORKDIR /mi_app
COPY target/web_control-0.0.1-SNAPSHOT.jar web_control-1.jar
EXPOSE 8000
ENTRYPOINT [ "java","-jar","web_control-1.jar" ]
