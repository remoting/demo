pipeline {
    agent any
    environment {
        DockerServer='192.168.40.184:2375'
        DockerRegistry='http://192.168.40.184:5000'
        DockerImageName='192.168.40.184:5000/demo:1'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn package'
            }
        }
        stage('Docker') {
            steps {
                echo 'Docker..'
                script {
                    docker.withServer(DockerServer) {
                        def image = docker.build(DockerImageName)
                        docker.withRegistry(DockerRegistry) { 
                            image.push();
                        }
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