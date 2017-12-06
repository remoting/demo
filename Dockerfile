FROM docker.yihecloud.com/base/java:2.0

MAINTAINER liyong yli@yihecloud.com

WORKDIR /program

COPY docker/startup.sh /program/startup.sh
COPY target/*.jar /program/app.jar

RUN chmod +x /program/startup.sh 

CMD /program/startup.sh
