pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Docker') {
            steps {
                step {
                    dev DockerServer='192.168.40.184:2375'
                    def DockerImageRegistry='http://192.168.40.184:5000'
                    def DockerImageName='192.168.40.184:5000/demo:1-$BUILD_TIMESTAMP'
                    withDockerServer([uri: DockerServer]) {
                        withDockerRegistry([url: DockerImageRegistry]) {
                            def image = docker.build(DockerImageName)
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