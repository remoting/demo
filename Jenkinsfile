pipeline {
    agent any
    environment {
        DockerServer='192.168.40.184:2375'
        DockerImageRegistry='http://192.168.40.184:5000'
        DockerImageName='192.168.40.184:5000/demo:1-$BUILD_TIMESTAMP'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Docker') {
            steps {
                echo 'Docker..'
                withDockerServer([uri: DockerServer]) {
                    withDockerRegistry([url: DockerImageRegistry]) {
                        def image = docker.build(DockerImageName)
                        image.push();
                    }
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}