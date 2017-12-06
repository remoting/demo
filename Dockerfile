FROM remoting/java:8

MAINTAINER remoting remoting@qq.com

WORKDIR /program

COPY docker/startup.sh /program/startup.sh
COPY target/*.jar /program/app.jar

RUN chmod +x /program/startup.sh 

CMD /program/startup.sh
