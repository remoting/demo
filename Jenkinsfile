pipeline {
    agent any

    stages {
            def DockerServer='192.168.40.184:2375'
            def DockerImageRegistry='http://192.168.40.184:5000'
            def DockerImageName='192.168.40.184:5000/demo:1-$BUILD_TIMESTAMP'
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Docker') {
            steps {
                echo 'Docker..'
                
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