FROM jenkins/jenkins:lts

USER root

# Copiar plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt

RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

# Copiar configuração
COPY casc.yaml /var/jenkins_home/casc.yaml

USER jenkins